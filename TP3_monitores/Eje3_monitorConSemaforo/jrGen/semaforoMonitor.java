/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


public class semaforoMonitor extends java.lang.Object {
    { JRinit(); }
    
    public semaforoMonitor() {
        // Begin Expr2
        super();
        JRprocess();
    }
    Op_ext.JRProxyOp JRget_op_colaEspera_voidTovoid()
    {
        return op_colaEspera_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_colaEspera_voidTovoid;
    
    Op_ext.JRProxyOp JRget_op_ocupado_voidTovoid()
    {
        return op_ocupado_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_ocupado_voidTovoid;
    
    int count = 1;
    
    public void Swait() {
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_ocupado_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        // Begin Expr2
        count--;
        if (count < 0) {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_colaEspera_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        op_ocupado_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
    }
    
    public void Ssignal() {
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_ocupado_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        // Begin Expr2
        count++;
        if (count <= 0) op_colaEspera_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
        op_ocupado_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
    }
    protected boolean JRcalled = false;
    protected JRsemaforoMonitor jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_ocupado_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	{
     	  long JRTotal = 1;
    	  if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
    	    for (long JRiter = 0; JRiter < JRTotal; JRiter++)
    	      op_ocupado_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	}
    	op_colaEspera_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	{
     	  long JRTotal = 0;
    	  if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
    	    for (long JRiter = 0; JRiter < JRTotal; JRiter++)
    	      op_colaEspera_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	}
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRsemaforoMonitor(op_ocupado_voidTovoid, op_colaEspera_voidTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
