package org.indra.view;

import org.indra.model.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Bienvenidos a la clase 4");
        System.out.println("Ejemplo del composite y polimorfismo");
        
        //Mis agregados
        FileSystemWatcher observer = new FileSystemWatcher();
        EntidadSistemaFicheros.RegistrarQuienMeMira(observer);
        
        //EntidadSistemaFicheros carpetaRaiz = new Carpeta("root"); 
        //System.out.println("Creando caperta root");
        Carpeta carpetaRaiz = new Carpeta("root");
        //System.out.println("Creando carpeta temp");
        Carpeta temp = new Carpeta("temp");
        //System.out.println("Creando carpeta trash");
        Carpeta trash = new Carpeta("trash");
        //System.out.println("Creando archivo autoexec.bat con 100 bytes");
        Archivo autoexec = new Archivo("autoexec.bat", 100);
        //System.out.println("Creando archivo imagen.jpg vacio");
        Archivo imagen = new Archivo("imagen.jpg");
        //System.out.println("Cambiando el tamaño del archivo imagen.jpg a 350 byts");
        imagen.setTamaño(350);
        
        
        //System.out.println("Agregando carpeta temp a carpeta raiz");
        carpetaRaiz.Add(temp);
        //System.out.println("Agregando autoexec.bar a caepta temp");
        temp.Add(autoexec);
        //System.out.println("Agregando carpeta thrash a carpeta temp");
        temp.Add(trash);
        //System.out.println("Agregando imagen.jpg a carpeta thrash");
        trash.Add(imagen);
        
        /*
         root
           /temp
              autoexec.bat 
              /trash
                 imagen.jpg
         */
        
       EntidadSistemaFicheros root = carpetaRaiz;
       System.out.println("El tamaño total es " + root.calcularTamaño());        
	}

}
