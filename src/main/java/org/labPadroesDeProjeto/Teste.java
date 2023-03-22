package org.labPadroesDeProjeto;

import org.labPadroesDeProjeto.facade.Facade;
import org.labPadroesDeProjeto.singleton.SingletonEager;
import org.labPadroesDeProjeto.singleton.SingletonLazy;
import org.labPadroesDeProjeto.singleton.SingletonLazyHolder;
import org.labPadroesDeProjeto.strategy.ComportamentoAgressivo;
import org.labPadroesDeProjeto.strategy.ComportamentoNormal;
import org.labPadroesDeProjeto.strategy.ComprtamentoDefensivo;
import org.labPadroesDeProjeto.strategy.Robo;

public class Teste {
    public static void main(String[] args) {

//        Singleton
/*
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println("\n" +lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("\n" +eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println("\n" + holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(eager);
 */

//        Strategy
/*
        ComprtamentoDefensivo defensivo = new ComprtamentoDefensivo();
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
 */
//       Facede

        Facade facade =new Facade();
        facade.migrarCliente("Jose", "50580190");

    }
}