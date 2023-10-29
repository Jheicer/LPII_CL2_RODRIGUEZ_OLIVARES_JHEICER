package testEntidades;

import java.util.List;

import dao.ClassCrudProducto;
import model.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		TblProductocl2 prod = new TblProductocl2();
		ClassCrudProducto crud = new ClassCrudProducto();
		
		// Registrar Producto
//		prod.setNombrecl2("Aji-no-mix");
//		prod.setPrecioventacl2(2.80);
//		prod.setPreciocompcl2(2.20);
//		prod.setEstadocl2("En stock");
//		prod.setDescripcl2("Sabor gallina picante");
//		crud.RegistrarProducto(prod);		
//		System.out.println("Producto registrado con éxito");
		
		// Listar Productos
		List<TblProductocl2> lista = crud.ListaProducto();
		  for(TblProductocl2 list:lista) {
			  System.out.print("\n" + 
                    "Código : " + list.getIdproductocl2() + "\n" + 
					"Nombre : " + list.getNombrecl2() + "\n" + 
                    "Precio Venta : " + list.getPrecioventacl2() + "\n" +
					"Precio Compra : " + list.getPreciocompcl2() + "\n" +
                    "Estado : " + list.getEstadocl2() + "\n" +
					"Descripción : " + list.getDescripcl2() + "\n" + "\n");
		  };
		
	}

}
