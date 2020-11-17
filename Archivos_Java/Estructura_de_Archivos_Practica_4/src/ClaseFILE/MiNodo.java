package ClaseFILE;

import java.io.File;
import java.util.Objects;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Axel Ordoñez
 */
public class MiNodo extends DefaultMutableTreeNode{
    private File archivo;

    public MiNodo(File archivo, Object userObject, boolean allowsChildren) {
        super(userObject, allowsChildren);
        this.archivo = archivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    @Override
    public String toString() {
        return "MiNodo{" + "archivo=" + archivo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MiNodo other = (MiNodo) obj;
        if (!Objects.equals(this.archivo, other.archivo)) {
            return false;
        }
        return true;
    }
    
    
}
