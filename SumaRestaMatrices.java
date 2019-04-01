public class SumaRestaMatrices {
	

    public static void main(String[] args) {
     int tablaA[][]=new int[3][3];
     int tablaB[][]=new int[3][3];
      
     //introducimos números en la Matriz A
     System.out.println("Introduce los números en la Matriz A:");
     for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
               System.out.print("Fila "+(i+1)+" Columna "+(j+1)+" = "); 
               tablaA[i][j]=CEntDatos.entero();
          }     
     }     
     System.out.println("------------------------------------------");
     //introducimos números en la Matriz B
    System.out.println("Introduce los números en la Matriz B:");
    for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
              System.out.print("Fila "+(i+1)+" Columna "+(j+1)+" = "); 
              tablaB[i][j]=CEntDatos.entero();
         }     
    }
    //Mostramos los números introducidos
    System.out.println("Estas son las matrices introducidas:");
    
    System.out.println("");
    System.out.println("MATRIZ A");
    System.out.println("-----------");
   
    for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             
              System.out.print(tablaA[i][j]+" ");
              
              if(j==2){
                  System.out.println("");
              }
              
         }     
    }
    System.out.println("MATRIZ B");
    System.out.println("-----------");
    
    for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             
              System.out.print(tablaB[i][j]+" ");
              
              if(j==2){
                  System.out.println("");
              }
              
         }     
    }
    //SUMA
    System.out.println("la Matriz suma es: ");
    for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             if((tablaA[i][j]+tablaB[i][j])<10){
                System.out.print(tablaA[i][j]+tablaB[i][j]+"  ");
             }else{
                System.out.print(tablaA[i][j]+tablaB[i][j]+" "); 
             } 
              if(j==2){
                  System.out.println("");
              }
              
         }     
    }
    //RESTA
    System.out.println("la Matriz resta es: ");
    for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             if((tablaA[i][j]- tablaB[i][j])<10){
                System.out.print(tablaA[i][j]-tablaB[i][j]+"  ");
             }else{
                System.out.print(tablaA[i][j]-tablaB[i][j]+" "); 
             } 
              if(j==2){
                  System.out.println("");
              }
         }