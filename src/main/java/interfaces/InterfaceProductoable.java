package interfaces;

import java.util.List;

import model.TblProductocl2;

public interface InterfaceProductoable {
	public void RegistrarProducto(TblProductocl2 tblprod);
	public List<TblProductocl2>ListaProducto();
}
