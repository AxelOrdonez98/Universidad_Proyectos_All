package productos;
import javax.swing.JOptionPane;
public class TestProductos {
    public static void main(String[] args) {
        CongeladosAgua congeladosAgua = null;
        CongeladosAire congeladosAire = null;
        CongeladosNitrogeno congeladosNitrogeno = null;
        Frescos frescos = null;
        Refrigerados refrigerados = null;
        
        int opcion1 = 1, opcion2 = 1, opcion3 = 1, opcion4 = 1, opcion5 = 1;
        
        do {            
            opcion1 = Integer.parseInt(JOptionPane.showInputDialog("0) Salir"
                    + "1) Crear"
                    + "2) Imprimir"));
            switch (opcion1) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    do {                        
                        opcion2 = Integer.parseInt(JOptionPane.showInputDialog("0) Salir"
                                + "1) Frescos"
                                + "2) Refrigerados"
                                + "3) Congelados"));
                        switch (opcion2) {
                            case 0:
                                System.out.println("Saliendo...");
                                break;
                            case 1:
                                if (frescos == null) {
                                    frescos = new Frescos();
                                } 
                                
                                frescos.setFechaCaducidad(JOptionPane.showInputDialog("Ingrese la fecha de caducidad"));
                                frescos.setFechaEnvasado(JOptionPane.showInputDialog("Ingrese la fecha de envasado"));
                                frescos.setLote(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de lote")));
                                frescos.setPaisOrigen(JOptionPane.showInputDialog("Ingrese el pais de origen"));
                                frescos.setTipoProducto(JOptionPane.showInputDialog("Ingrese el tipo de producto"));
                                break;
                            case 2:
                                if (refrigerados == null) {
                                    refrigerados = new Refrigerados();
                                } 
                                
                                refrigerados.setFechaCaducidad(JOptionPane.showInputDialog("Ingrese la fecha de caducidad"));
                                refrigerados.setFechaEnvasado(JOptionPane.showInputDialog("Ingrese la fecha de envasado"));
                                refrigerados.setLote(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de lote")));
                                refrigerados.setPaisOrigen(JOptionPane.showInputDialog("Ingrese el pais de origen"));
                                refrigerados.setCodigoSupervicionAlimentaria(JOptionPane.showInputDialog("Ingrese el codigo de supervicion alimentaria"));
                                refrigerados.setTemperaturaMantenimientoRefrigerados(JOptionPane.showInputDialog("Ingrese la temperatura de mantenimiento antes de refrigerarse"));
                                break;  
                            case 3:
                                do {                                    
                                    opcion3 = Integer.parseInt(JOptionPane.showInputDialog("0) Salir"
                                            + "\n1) Congelados por agua"
                                            + "\n2) Congelados por aire"
                                            + "\n3) Congelados por nitrogeno"));
                                    switch (opcion3) {
                                        case 0:
                                            break;
                                        case 1:
                                            if (congeladosAgua == null) {
                                                congeladosAgua = new CongeladosAgua();
                                            } 

                                            congeladosAgua.setFechaCaducidad(JOptionPane.showInputDialog("Ingrese la fecha de caducidad"));
                                            congeladosAgua.setFechaEnvasado(JOptionPane.showInputDialog("Ingrese la fecha de envasado"));
                                            congeladosAgua.setLote(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de lote")));
                                            congeladosAgua.setPaisOrigen(JOptionPane.showInputDialog("Ingrese el pais de origen"));
                                            congeladosAgua.setTemperaturaMantenimientoCongelados(JOptionPane.showInputDialog("Ingrese la temperatura de mantenimiento"));
                                            congeladosAgua.setSalxAgua(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de sal x agua")));
                                            break;
                                        case 2:
                                            if (congeladosAire == null) {
                                                congeladosAire = new CongeladosAire();
                                            } 

                                            congeladosAire.setFechaCaducidad(JOptionPane.showInputDialog("Ingrese la fecha de caducidad"));
                                            congeladosAire.setFechaEnvasado(JOptionPane.showInputDialog("Ingrese la fecha de envasado"));
                                            congeladosAire.setLote(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de lote")));
                                            congeladosAire.setPaisOrigen(JOptionPane.showInputDialog("Ingrese el pais de origen"));
                                            congeladosAire.setTemperaturaMantenimientoCongelados(JOptionPane.showInputDialog("Ingrese la temperatura de mantenimiento"));
                                            congeladosAire.setDioxidoCarbono(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dioxido de carbono")));
                                            congeladosAire.setNitrogeno(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dioxido de nitrogeno")));
                                            congeladosAire.setOxigeno(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dioxido de oxigeno")));
                                            congeladosAire.setVaporAgua(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de vapor por agua")));

                                            break;
                                        case 3:
                                            if (congeladosNitrogeno == null) {
                                                congeladosNitrogeno = new CongeladosNitrogeno();
                                            } 

                                            congeladosNitrogeno.setFechaCaducidad(JOptionPane.showInputDialog("Ingrese la fecha de caducidad"));
                                            congeladosNitrogeno.setFechaEnvasado(JOptionPane.showInputDialog("Ingrese la fecha de envasado"));
                                            congeladosNitrogeno.setLote(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de lote")));
                                            congeladosNitrogeno.setPaisOrigen(JOptionPane.showInputDialog("Ingrese el pais de origen"));
                                            congeladosNitrogeno.setTemperaturaMantenimientoCongelados(JOptionPane.showInputDialog("Ingrese la temperatura de mantenimiento"));
                                            congeladosNitrogeno.setMetodoCongelacion(JOptionPane.showInputDialog("Ingrese el metodo de congelacion"));
                                            congeladosNitrogeno.setTiempoExposicion(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo de exposicion")));
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                                            break;
                                    }
                                } while (opcion3 != 0);
                                break;
                        }
                    } while (opcion2 != 0);
                    break;
                case 2:
                    do {                        
                        opcion4 = Integer.parseInt(JOptionPane.showInputDialog("0) Salir"
                                + "1) Frescos"
                                + "2) Refrigerados"
                                + "3) Congelados"));
                        switch (opcion4) {
                            case 0:
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(null, frescos);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, refrigerados);
                                break;
                            case 3:
                                do {                                    
                                    opcion5 = Integer.parseInt(JOptionPane.showInputDialog("0) Salir"
                                            + "\n1) Congelados por agua"
                                            + "\n2) Congelados por aire"
                                            + "\n3) Congelados por nitrogeno"));
                                    switch (opcion5) {
                                        case 0:
                                            break;
                                        case 1:
                                            JOptionPane.showMessageDialog(null, congeladosAgua);
                                            break;
                                        case 2:
                                            JOptionPane.showMessageDialog(null, congeladosAire);
                                            break;   
                                        case 3:
                                            JOptionPane.showMessageDialog(null, congeladosNitrogeno);
                                            break;    
                                        default:
                                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                                            break;
                                    }
                                } while (opcion5 != 0);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion invalida");
                                break;
                        }
                    } while (opcion4 != 0);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion1 != 0);
    }
}
