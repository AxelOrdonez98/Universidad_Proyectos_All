package dto;

import java.io.Serializable;
import static java.lang.System.in;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 7053
 */
public class ProductoDTO implements Serializable {

    private static final Logger LOG = Logger.getLogger(ProductoDTO.class.getName());
    public static final int longitud = 150 + Long.BYTES + Integer.BYTES + Integer.BYTES + Integer.BYTES + Integer.BYTES + 22;

    private Long id;
    private StringBuffer NombreCel;
    private StringBuffer SO;
    private Integer ram;
    private StringBuffer ROM;
    private Integer numeroCamaras;
    private StringBuffer Acabado;
    private Integer bateria;
    private Integer NumBotones;

    public ProductoDTO() {
        setId(0L);
        setCpu(new StringBuffer(""));
        setMotherboard(new StringBuffer(""));
        setRam(000);
        setGpu(new StringBuffer(""));
        setPsu(0000);
        setGabinete(new StringBuffer(""));
        setMonitores(0);
        setPrecio(00);
    }

    public ProductoDTO(Long id, StringBuffer NombreCel, StringBuffer SO, Integer ram, StringBuffer ROM, Integer numeroCamaras, StringBuffer Acabado, Integer bateria, Integer NumBotones) {
        setId(id);
        setCpu(NombreCel);
        setMotherboard(SO);
        setRam(ram);
        setGpu(ROM);
        setPsu(numeroCamaras);
        setGabinete(Acabado);
        setMonitores(bateria);
        setPrecio(NumBotones);
    }

    public ProductoDTO(String registro) {
        //System.out.println(registro);
        // registro=registro.substring(3);
        //registro=registro.replace("}", "");
        if (registro != null) {
            registro = registro.substring(registro.indexOf("{") + 1, registro.indexOf("}"));
            String datos[] = registro.split(",");
            System.out.println("id: " + datos[0]);
            if (!datos[0].equals("000")) {
                id = Long.parseLong(datos[0]);
                NombreCel = new StringBuffer(datos[1].trim());
                SO = new StringBuffer(datos[2].trim());
                ram = Integer.parseInt(datos[3]);
                ROM = new StringBuffer(datos[4].trim());
                numeroCamaras = Integer.parseInt(datos[5]);
                Acabado = new StringBuffer(datos[6].trim());
                bateria = Integer.parseInt(datos[7]);
                NumBotones = Integer.parseInt((datos[8]));
            }
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StringBuffer getCpu() {
        return NombreCel;
    }

    public void setCpu(StringBuffer NombreCel) {
        this.NombreCel = NombreCel;
        for (int i = NombreCel.length(); i < 15; i++) {
            this.NombreCel.append(" ");
        }
    }

    public StringBuffer getMotherboard() {
        return SO;
    }

    public void setMotherboard(StringBuffer SO) {
        this.SO = SO;
        for (int i = SO.length(); i < 20; i++) {
            this.SO.append(" ");
        }
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public StringBuffer getGpu() {
        return ROM;
    }

    public void setGpu(StringBuffer ROM) {
        this.ROM = ROM;
        for (int i = ROM.length(); i < 20; i++) {
            this.ROM.append(" ");
        }
    }

    public Integer getPsu() {
        return numeroCamaras;
    }

    public void setPsu(Integer numeroCamaras) {
        this.numeroCamaras = numeroCamaras;
    }

    public StringBuffer getGabinete() {
        return Acabado;
    }

    public void setGabinete(StringBuffer Acabado) {
        this.Acabado = Acabado;
        for (int i = Acabado.length(); i < 20; i++) {
            this.Acabado.append(" ");
        }
    }

    public Integer getMonitores() {
        return bateria;
    }

    public void setMonitores(Integer bateria) {
        this.bateria = bateria;
    }

    public Integer getPrecio() {
        return NumBotones;
    }

    public void setPrecio(Integer NumBotones) {
        this.NumBotones = NumBotones;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoDTO other = (ProductoDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "id=" + id + ", NombreCel=" + NombreCel + ", SO=" + SO + ", ram=" + ram + ", ROM=" + ROM + ", numeroCamaras=" + numeroCamaras + ", Acabado=" + Acabado + ", bateria=" + bateria + ", NumBotones=" + NumBotones + '}';
    }

    public String toStringFile() {
        setCpu(NombreCel);
        setMotherboard(SO);
        setGpu(ROM);
        setGabinete(Acabado);
        String idS = "" + id;
        String ramS = "" + ram;
        String numeroCamarasS = "" + numeroCamaras;
        String bateriaS = "" + bateria;
        String NumBotonesS = "" + NumBotones;
        switch (idS.length()) {
            case 1:
                idS = "00" + id;
                break;
            case 2:
                idS = "0" + id;
                break;
        }
        switch (ramS.length()) {
            case 1:
                ramS = "00" + ram;
                break;
            case 2:
                ramS = "0" + ram;
                break;
        }
        switch (numeroCamarasS.length()) {
            case 1:
                numeroCamarasS = "000" + numeroCamarasS;
                break;
            case 2:
                numeroCamarasS = "00" + numeroCamarasS;
                break;
            case 3:
                numeroCamarasS = "0" + numeroCamarasS;
                break;
        }

        switch (NumBotonesS.length()) {
            case 1:
                NumBotonesS = "0" + NumBotones;
                break;
        }
        return "{" + idS + "," + NombreCel + "," + SO + "," + ramS + "," + ROM + "," + numeroCamarasS + "," + Acabado + "," + bateriaS + "," + NumBotonesS + "}\n";
    }
}
