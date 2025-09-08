/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestion;

/**
 *
 * @author Duoc
 */
public class SistemaGestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Int opcion;
        String lectura;
        Int numero;


        //Onjeto cliente


        Cliente cliente1 = new Cliente();

        //objeto venderor

        Vendedor vendedor1 = new Vendedor();

        
        do{
            System.out.println("-- SISTEMA DE GESTION --");
            System.out.println("1.- Ingresar cliente");
            System.out.println("2.- Ingresar vendedor");
            System.out.println("3.- Ingresar producto");
            System.out.println("4.- Generar pedido");
            System.out.println("5.- Salir ");
            System.out.println("Selccione una opcion: ");
            opcion = leer.nextInt();

            switch(opcion){

                case 1: 
                    System.out.println("-- INGRESO DE CLIENTE --")
                    System.out.println("Ingrese RUT del cliente: ");
                    lectura = next();
                    cliente1.setRut(lectura);

                    System.out.println("Ingrese nombre del cliente: ");
                    lectura = leer.next();
                    cliente1.setNombre(lectura);

                    System.out.println("Ingrese la edad del cliente: ");
                    numero = leer.nextInt();
                    cliente1.setEdad(numero);

                    System.out.println("Ingrese la fecha de nacimiento:  ");
                    lectura = leer.next();
                    cliente1.setFechaNacimiento(lectura);

                case 2:

                    System.out.println("-- INGRESO DE DOCENTE --")
                    System.out.println("ingrse rut del vendedor: ")
                    lectura = leer.next();    
                    vendedor1.setRut(lectura);
                        
                    System.out.println("Ingrese nr vendeor ")

                     System.out.println("-- INGRESO DE CLIENTE --")
                        
                        
                    

                    
                    
                        



                    
            }

            
            



            
        }



        
    }
    
}


