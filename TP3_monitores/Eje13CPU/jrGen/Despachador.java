/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


class Despachador extends java.lang.Object {
    { JRinit(); }
    Op_ext.JRProxyOp JRget_op_m_mutex_voidTovoid()
    {
        return op_m_mutex_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_m_mutex_voidTovoid;
    
    Op_ext.JRProxyOp JRget_op_m_urgentq_voidTovoid()
    {
        return op_m_urgentq_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_m_urgentq_voidTovoid;
    
    int m_n_urgentq = 0;
    String m_name;
    
    public Despachador(String n) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.m_name = n;
        JRprocess();
    }
    
    private void m_next() {
        if (m_n_urgentq > 0) {
            // Begin Expr2
            m_n_urgentq--;
            op_m_urgentq_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
        } else {
            op_m_mutex_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
        }
    }
    private m_condvar cpu = new m_condvar("cpu");
    private int asignaciones0 = 0;
    private int asignaciones1 = 0;
    private boolean cpu0Libre = true;
    private boolean cpu1Libre = true;
    
    public int adquirirCPU(int i) {
        Op_ext.JRProxyOp op_m_return_from_wait_voidTovoid = null;
        try{
            op_m_return_from_wait_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        int proceso = i;
        JRLoop0: while (!cpu0Libre && !cpu1Libre) {
            {
                m_condvar m_cv = (cpu);
                m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
                m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
                // Begin Expr2
                m_next();
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        }
        if (cpu0Libre) {
            // Begin Expr2
            cpu0Libre = false;
            // Begin Expr2
            asignaciones0++;
            {
                if (true) {
                    // Begin Expr2
                    m_next();
                    // Return
                    return (0);
                    // End Return

                }
            }
        } else if (cpu1Libre) {
            // Begin Expr2
            cpu1Libre = false;
            // Begin Expr2
            asignaciones1++;
            {
                if (true) {
                    // Begin Expr2
                    m_next();
                    // Return
                    return (1);
                    // End Return

                }
            }
        }
        // Begin Expr2
        m_next();
        throw new RuntimeException("reached end of non-void _proc (Despachador.m, line 26) without executing a return");
    }
    
    public void liberarCPU(int cp, int proceso) {
        Op_ext.JRProxyOp op_m_return_from_wait_voidTovoid = null;
        try{
            op_m_return_from_wait_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        if (cp == 0) {
            // Begin Expr2
            cpu0Libre = true;
        } else if (cp == 1) {
            // Begin Expr2
            cpu1Libre = true;
        }
        {
            if (((Boolean) (new Cap_ext_((cpu).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        }
        // Begin Expr2
        m_next();
    }
    protected boolean JRcalled = false;
    protected JRDespachador jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_m_urgentq_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	{
     	  long JRTotal = 0;
    	  if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
    	    for (long JRiter = 0; JRiter < JRTotal; JRiter++)
    	      op_m_urgentq_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	}
    	op_m_mutex_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	{
     	  long JRTotal = 1;
    	  if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
    	    for (long JRiter = 0; JRiter < JRTotal; JRiter++)
    	      op_m_mutex_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	}
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRDespachador(op_m_urgentq_voidTovoid, op_m_mutex_voidTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
