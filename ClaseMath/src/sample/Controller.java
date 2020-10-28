package sample;

import Calculos.calculos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

@FXML TextField txtarreglo1, txtarreglo2;
@FXML ListView lista1, lista2;

    double []arreglo=new double[5];
    double [][]arreglo2=new double [2][4];
    int cont1=0;
    int cont2=0;
    int cont3=0;

    public void insertar(ActionEvent event){
        if(cont1<5){
            double dato=Double.parseDouble(txtarreglo1.getText());
            arreglo[cont1]=dato;
            cont1++;
            txtarreglo1.setText("");

        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Arreglo lleno");
            alert.show();
        }
      imprimirarreglos(arreglo);



    }

    public void insertar1(ActionEvent event){
        if(cont2< 2){
            double dato=Double.parseDouble(txtarreglo2.getText());
            arreglo2[cont2][cont3]=dato;
            cont3++;
            if(cont3 ==4){
                cont3=0;
                cont2++;
            }
            txtarreglo2.setText("");
            imprimirarreglobidi(arreglo2);
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Arreglo lleno");
            alert.show();
        }


    }

    public void procesar1(ActionEvent event ){



    }//procesar1
    public void procesar2(ActionEvent event ){

        calculos Calculo1=new calculos(arreglo,arreglo2);
        double [][] res= Calculo1.procesarseno();
        for(int x=0;x<res.length;x++){
            String columna="";
            for(int y=0;y<res[x].length;y++){
                columna = columna+res[x][y]+", ";

            }
          lista2.getItems().add(columna);
        }


    }//procesar2

   public void imprimirarreglos (double []arr ){
        for(int x=0;x<arreglo.length;x++){
            System.out.print(arr[x]+ ",");
       }
       System.out.println("");
   }

public void imprimirarreglobidi(double [][]arr){
        for(int x=0;x<arr.length;x++){
            for(int y=0;y<arr[x].length;y++){
                System.out.print(arr[x][y]+",");
            }
            System.out.println("");
        }
    System.out.println("________________________________");

}

}
