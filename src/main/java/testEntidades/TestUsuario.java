package testEntidades;

import dao.ClassCrudUsuario;
import model.TblUsuariocl2;

public class TestUsuario {

	public static void main(String[] args) {
		
		TblUsuariocl2 usu = new TblUsuariocl2();
		ClassCrudUsuario crud = new ClassCrudUsuario();
		   
//		usu.setUsuariocl2("Jhordan");
//		usu.setPasswordcl2("98236455");   
//		crud.RegistrarUsuario(usu);
//		System.out.println("Usuario registado exitosamente");
	   		  	    
		//asignamos valores
		usu.setUsuariocl2("Jheicer");
		usu.setPasswordcl2("Jh3ic3r019");
		String mensaje =crud.ValidarUsuario(usu);
		
		System.out.println(mensaje);
	}
}
