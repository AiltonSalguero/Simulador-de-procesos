/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.dtoProceso;
import Ventana.Estadisticas;
import Ventana.PCB;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class daoPCB {
    public static void CargarPCB(PCB pcb, int tipo, dtoProceso proceso, int ini, int fin){
        if(tipo==1){
            pcb.tblPCBFCFS.setBackground(Color.WHITE);
            DefaultTableModel modelo = (DefaultTableModel) pcb.tblPCBFCFS.getModel();
            Object[] miTabla = new Object[11];
            miTabla[0]=proceso.getIdentificador();
            miTabla[1]=proceso.getEstadoCPU();
            miTabla[2]=proceso.getProcesador();
            miTabla[3]=proceso.getMemoria().getKey().toString()+'-'+proceso.getMemoria().getValue().toString();
            miTabla[4]=proceso.getEstadoProceso();
            miTabla[5]=proceso.getRecursos().size();
            miTabla[6]=proceso.getPlanificador();
            miTabla[7]=proceso.getPrioridad();
            miTabla[8]=proceso.getContabilizacion();
            miTabla[9]=proceso.getAncestro();
            String aux="";
            for(int i=0; i<proceso.getDescendientes().size(); i++){
                if(i==0){
                    aux+=proceso.getDescendientes().get(i).toString();
                }else{
                    aux+='-'+proceso.getDescendientes().get(i).toString();
                }
            }
            miTabla[10]=aux;
            modelo.addRow(miTabla);
            pcb.tblPCBFCFS.setModel(modelo);
        }else if(tipo==2){
            pcb.tblPCBSJF.setBackground(Color.WHITE);
            DefaultTableModel modelo = (DefaultTableModel) pcb.tblPCBSJF.getModel();
            Object[] miTabla = new Object[11];
            miTabla[0]=proceso.getIdentificador();
            miTabla[1]=proceso.getEstadoCPU();
            miTabla[2]=proceso.getProcesador();
            miTabla[3]=proceso.getMemoria().getKey().toString()+'-'+proceso.getMemoria().getValue().toString();
            miTabla[4]=proceso.getEstadoProceso();
            miTabla[5]=proceso.getRecursos().size();
            miTabla[6]=proceso.getPlanificador();
            miTabla[7]=proceso.getPrioridad();
            miTabla[8]=proceso.getContabilizacion();
            miTabla[9]=proceso.getAncestro();
            String aux="";
            for(int i=0; i<proceso.getDescendientes().size(); i++){
                if(i==0){
                    aux+=proceso.getDescendientes().get(i).toString();
                }else{
                    aux+='-'+proceso.getDescendientes().get(i).toString();
                }
            }
            miTabla[10]=aux;
            modelo.addRow(miTabla);
            pcb.tblPCBSJF.setModel(modelo);
        }else{
            pcb.tblPCBRR.setBackground(Color.WHITE);
            DefaultTableModel modelo = (DefaultTableModel) pcb.tblPCBRR.getModel();
            Object[] miTabla = new Object[11];
            miTabla[0]=proceso.getIdentificador();
            miTabla[1]=proceso.getEstadoCPU();
            miTabla[2]=proceso.getProcesador();
            miTabla[3]=proceso.getMemoria().getKey().toString()+'-'+proceso.getMemoria().getValue().toString();
            miTabla[4]=proceso.getEstadoProceso();
            miTabla[5]=proceso.getRecursos().size();
            miTabla[6]=proceso.getPlanificador();
            miTabla[7]=proceso.getPrioridad();
            miTabla[8]=proceso.getContabilizacion();
            miTabla[9]=proceso.getAncestro();
            String aux="";
            for(int i=0; i<proceso.getDescendientes().size(); i++){
                if(i==0){
                    aux+=proceso.getDescendientes().get(i).toString();
                }else{
                    aux+='-'+proceso.getDescendientes().get(i).toString();
                }
            }
            miTabla[10]=aux;
            modelo.addRow(miTabla);
            pcb.tblPCBRR.setModel(modelo);
        }
    }
    
    public static void ActualizaEstadoPCB(PCB pcb, int pos, int tipo, String estado){
        if(tipo==1){
            pcb.tblPCBFCFS.setValueAt(estado,pos-1,4);
        }else if(tipo==2){
            pcb.tblPCBSJF.setValueAt(estado,pos-1,4);
        }else{
            pcb.tblPCBRR.setValueAt(estado,pos-1,4);
        }
    }
    
    public static void ActualizaDescendientesPCB(PCB pcb, int pos, int tipo, int descendiente){
        String aux="";
        if(tipo==1){
            aux=pcb.tblPCBFCFS.getValueAt(pos-1,10).toString();
            aux+='-'+String.valueOf(descendiente);
            pcb.tblPCBFCFS.setValueAt(aux, pos-1, 10);
        }else if(tipo==2){
            aux=pcb.tblPCBSJF.getValueAt(pos-1,10).toString();
            aux+='-'+String.valueOf(descendiente);
            pcb.tblPCBSJF.setValueAt(aux, pos-1, 10);
        }else{
            aux=pcb.tblPCBRR.getValueAt(pos-1,10).toString();
            aux+='-'+String.valueOf(descendiente);
            pcb.tblPCBRR.setValueAt(aux, pos-1, 10);
        }
    }
    
    public static void ActualizaEstadisticaINI(Estadisticas estadistica, int pos, int tipo, int ini){
        if(tipo==1){
            estadistica.tblEstadisticaFCFS.setValueAt(String.valueOf(ini),pos-1,2);
        }else if(tipo==2){
            estadistica.tblEstadisticaSJF.setValueAt(String.valueOf(ini),pos-1,2);
        }else{
            estadistica.tblEstadisticaRR.setValueAt(String.valueOf(ini),pos-1,2);
        }
    }
    
    public static void ActualizaEstadisticaFIN(Estadisticas estadistica, int pos, int tipo, int fin){
        if(tipo==1){
            estadistica.tblEstadisticaFCFS.setValueAt(String.valueOf(fin),pos-1,3);
        }else if(tipo==2){
            estadistica.tblEstadisticaSJF.setValueAt(String.valueOf(fin),pos-1,3);
        }else{
            estadistica.tblEstadisticaRR.setValueAt(String.valueOf(fin),pos-1,3);
        }
    }
}
