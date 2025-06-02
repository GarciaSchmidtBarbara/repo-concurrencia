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
    Op_ext.JRProxyOp JRget_op_mutex_voidTovoid()
    {
        return op_mutex_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_mutex_voidTovoid;
    
    Op_ext.JRProxyOp JRget_op_colaCond_voidTovoid()
    {
        return op_colaCond_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_colaCond_voidTovoid;
    
    int esperando = 0;
    int recurso = 1;
    
    public void Swait() {
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        // Begin Expr2
        recurso--;
        if (recurso < 0) {
            // Begin Expr2
            esperando++;
            op_mutex_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = op_colaCond_voidTovoid.recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
        }
        op_mutex_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
    }
    
    public void Ssignal() {
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        // Begin Expr2
        recurso++;
        if (esperando > 0) {
            // Begin Expr2
            esperando--;
            op_colaCond_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
        }
        op_mutex_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
    }
    protected boolean JRcalled = false;
    protected JRsemaforoMonitor jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_colaCond_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	{
     	  long JRTotal = 0;
    	  if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
    	    for (long JRiter = 0; JRiter < JRTotal; JRiter++)
    	      op_colaCond_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	}
    	op_mutex_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	{
     	  long JRTotal = 1;
    	  if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
    	    for (long JRiter = 0; JRiter < JRTotal; JRiter++)
    	      op_mutex_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	}
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRsemaforoMonitor(op_colaCond_voidTovoid, op_mutex_voidTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
