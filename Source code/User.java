
import java.awt.Image;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nitesh Bhardwaj
 */
class User{
    private int cid;
    private String cname,fname,gender,adr;
    private Date date;
  
    
    public User(int cid,String cname,String fname,String gender,java.sql.Date date,String adr)
    {
    this.cid=cid;
    this.cname=cname;
    this.fname=fname;
    this.gender=gender;
    this.date=date;
    this.adr=adr;
  
    }
public int getcid()
    {
    return cid;
    }
    public String getcname()
    {
    return cname;
    }
    public String getfname()
    {
    return fname;
    }
    public String getgender()
    {
    return gender;
    }
    public Date getdate()
    {
    return date;
    }
    public String getadr()
    {
    return adr;
    }
    
}
