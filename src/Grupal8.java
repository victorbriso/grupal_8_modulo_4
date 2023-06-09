import java.util.Scanner;
public class Grupal8 {
    public static void main(String[] args){
        String usuarios[][];
        int iteral, accion, perfil;
        Scanner lectura = new Scanner (System.in);
        iteral      =   0;
        accion      =   0;
        usuarios    =   new String[100][11];

        do{
            System.out.println("Para Ingresar un usuario pulse 1, para ver los registros pulse 2, para terminar la ejecución pulse 3");
            accion = lectura.nextInt();
            if(accion==1){
                try{
                    System.out.println("Ingrese el nombre del usuario");
                    usuarios[iteral][0]=lectura.next();
                    System.out.println("Ingrese la fecha de nacimiento");
                    usuarios[iteral][1]=lectura.next();
                    System.out.println("Ingrese el RUN del usuario");
                    usuarios[iteral][2]=lectura.next();
                    System.out.println("Ingrese el perfil del usuario");
                    System.out.println("Ingrese 1 para el perfil CLIENTE");
                    System.out.println("Ingrese 2 para el perfil PROFESIONAL");
                    System.out.println("Ingrese 3 para el perfil ADMINISTRATIVO");
                    perfil=lectura.nextInt();
                    usuarios[iteral][10]=String.valueOf(perfil);
                    if(perfil==1){
                        System.out.println("Ingrese la dirección ");
                        lectura = new Scanner (System.in);
                        usuarios[iteral][3]=lectura.nextLine();
                        System.out.println("Ingrese el teléfono ");
                        lectura = new Scanner (System.in);
                        usuarios[iteral][4]=lectura.nextLine();
                        System.out.println("Ingrese la cantidad de empleados ");
                        lectura = new Scanner (System.in);
                        usuarios[iteral][5]=lectura.nextLine();
                    }
                    if(perfil==2){
                        System.out.println("Ingrese años de esperiencia \n");
                        lectura = new Scanner (System.in);
                        usuarios[iteral][6]=lectura.next();
                        System.out.println("Ingrese el departamento \n");
                        lectura = new Scanner (System.in);
                        usuarios[iteral][7]=lectura.next();
                    }
                    if(perfil==3){
                        System.out.println("Ingrese función \n");
                        lectura = new Scanner (System.in);
                        usuarios[iteral][8]=lectura.next();
                        System.out.println("Ingrese nombre del superior \n");
                        lectura = new Scanner (System.in);
                        usuarios[iteral][9]=lectura.next();
                    }
                    iteral++;
                } catch (Exception e){
                    System.out.println("Ocurrio un error"+e);
                }
            }
            if(accion==2) {
                for (String[] element : usuarios){
                    if(element[0]!=null){
                        System.out.print("Nombre: " + element[0] +"\n");
                        System.out.print("Fecha Nac: " + element[1]+"\n");
                        System.out.print("RUN: " + element[2]+"\n");
                        if (element[10]=="1") {
                            System.out.println("Perfil CLIENTE"+"\n");
                            System.out.println("Dirección: "+element[3]+"\n");
                            System.out.println("Teléfono: "+element[4]+"\n");
                            System.out.println("Cantidad de empleados: "+element[5]+"\n");
                        }
                        if (element[10]=="2") {
                            System.out.println("Perfil PROFESIONAL"+"\n");
                            System.out.println("Años de experiencia: "+element[6]+"\n");
                            System.out.println("Departamento: "+element[7]+"\n");
                        }
                        if (element[10]=="3") {
                            System.out.println("Perfil ADMINISTRATIVO"+"\n");
                            System.out.println("Funcion: "+element[8]+"\n");
                            System.out.println("Supervisor: "+element[9]+"\n");
                        }
                    }
                }
            }
        }
        while(accion!=3);
    }
}
