/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duyurutakipsistemi;

import javafx.event.ActionEvent;

/**
 *
 * @author hp
 */
public interface InterfaceController {
   public void kayitEkle(ActionEvent event);
   public void kayitGuncelle();
   public void kayitSil() ;
   public void duyurular(ActionEvent a);
   public void cikis(ActionEvent a);
}
