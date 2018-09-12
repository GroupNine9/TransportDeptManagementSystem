/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.MyDb;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paige
 */
public class Task {
    
     private String instructions, additionals,work, defects, item,model,reg,reqno,noteno,date,cost,labourhourscost,gasweldingcost,wheelbalancecost,paintcost;
    
     public Task()
     {
         instructions = "";
         additionals = "";
         work = "";
         defects = "";
         item = "";
         model = "";
         reg = "";
         reqno = "";
         noteno = "";
         date = "";
         cost = "";
         labourhourscost = "";
         gasweldingcost = "";
         wheelbalancecost = "";
         paintcost = "";
     }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }


    public String getAdditionals() {
        return additionals;
    }

    public void setAdditionals(String additionals) {
        this.additionals = additionals;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getDefects() {
        return defects;
    }

    public void setDefects(String defects) {
        this.defects = defects;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getReqno() {
        return reqno;
    }

    public void setReqno(String reqno) {
        this.reqno = reqno;
    }

    public String getNoteno() {
        return noteno;
    }

    public void setNoteno(String noteno) {
        this.noteno = noteno;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getLabourhourscost() {
        return labourhourscost;
    }

    public void setLabourhourscost(String labourhourscost) {
        this.labourhourscost = labourhourscost;
    }

    public String getGasweldingcost() {
        return gasweldingcost;
    }

    public void setGasweldingcost(String gasweldingcost) {
        this.gasweldingcost = gasweldingcost;
    }

    public String getWheelbalancecost() {
        return wheelbalancecost;
    }

    public void setWheelbalancecost(String wheelbalancecost) {
        this.wheelbalancecost = wheelbalancecost;
    }

    public String getPaintcost() {
        return paintcost;
    }

    public void setPaintcost(String paintcost) {
        this.paintcost = paintcost;
    }

    
        
    
    public void taskReport()
    {
        try
        {    
            MyDb dbconn=new MyDb();
            dbconn.getCon();

            String sqlString="INSERT INTO taskreport (workinstruction, additionalrepair,workdone, defects, item,reqno,noteno,date,cost,model,regno,labourhourscost,gasweldingcost,wheelbalancecost,paintcost) VALUES ('"+instructions+"','"+additionals+"','"+work+"','"+defects+"','"+item+"','"+reqno+"','"+noteno+"','"+date+"','"+cost+"','"+model+"','"+reg+"', '"+labourhourscost+"','"+gasweldingcost+"','"+wheelbalancecost+"','"+paintcost+"')";
            
            Statement myStatement = dbconn.con.createStatement();
            
            try
            {    
                myStatement.executeUpdate(sqlString);
                myStatement.close();
                dbconn.con.close();
            } catch (SQLException ex) {Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);}
        } catch (SQLException ex) {Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);}  
    }
}
    

