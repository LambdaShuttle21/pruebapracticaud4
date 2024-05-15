package org.iesvdm.reservamesa;

//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReservaMesaTest {

    @Test
    void failTest() {
        fail("TEST SIN IMPLEMENTAR");
    }



@Test

void rellenarMesaTest1 (){

      ReservaMesa rellenarMesa = new ReservaMesa();

      ReservaMesa capacidadMax = new ReservaMesa();

      int[] capacidadMesa = new int[4];

      capacidadMax.getMesas();

      int[] mesas = new int[12];

      rellenarMesa.rellenarMesas();

      assertThat(mesas).isEqualTo(rellenarMesa);

}

@Test

    void buscarPrimeraMesaVacia (){

        ReservaMesa mesaVacia = new ReservaMesa();
        ReservaMesa mesaDisponible = new ReservaMesa();

        int [] mesas = new int [12];
        mesaDisponible.setMesas(mesas);

        for (int i = 0; i<mesas.length; i++){

            if (mesas[i] == 0){

        }

assertThat(mesas).containsAnyOf(0-12);


}

}

@Test

    void identificarMesaParaCompartir(){

     ReservaMesa mesa = new ReservaMesa();

    int [] mesas = new int[12];
    int [] mesaVacia = new int[0];
    int tamanioMesa = 4;

    for (int i = 0; i<mesas.length ;i++){
        int aleatorio = (int) (Math.random()*tamanioMesa+1);

        mesas[i]=aleatorio;

        assertThat(mesas).containsExactly(3);



        }
    }

}


