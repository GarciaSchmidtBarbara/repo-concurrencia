/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


class Monitor extends java.lang.Object {
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
    
    public Monitor(String n) {
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
    private m_condvar ponerQueso = new m_condvar("ponerQueso");
    private m_condvar ponerSalsa = new m_condvar("ponerSalsa");
    private m_condvar ponerMorron = new m_condvar("ponerMorron");
    private m_condvar prepararPizza = new m_condvar("prepararPizza");
    private int totales = 0;
    private boolean ayudanteQuesolisto = false;
    private boolean ayudanteMorronlisto = false;
    private boolean ayudanteSalsalisto = false;
    
    public void colocarQueso() {
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
        // Begin Expr2
        ayudanteQuesolisto = true;
        {
            if (((Boolean) (new Cap_ext_((prepararPizza).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        }
        {
            m_condvar m_cv = (ponerQueso);
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
        // Begin Expr2
        System.out.println("poner queso");
        {
            if (((Boolean) (new Cap_ext_((prepararPizza).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
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
    
    public void colocarMorron() {
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
        // Begin Expr2
        ayudanteMorronlisto = true;
        {
            if (((Boolean) (new Cap_ext_((prepararPizza).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        }
        {
            m_condvar m_cv = (ponerMorron);
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
        // Begin Expr2
        System.out.println("poner morron");
        {
            if (((Boolean) (new Cap_ext_((prepararPizza).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
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
    
    public void colocarSalsa() {
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
        // Begin Expr2
        ayudanteSalsalisto = true;
        {
            if (((Boolean) (new Cap_ext_((prepararPizza).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        }
        {
            m_condvar m_cv = (ponerSalsa);
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
        // Begin Expr2
        System.out.println("poner salsa");
        {
            if (((Boolean) (new Cap_ext_((prepararPizza).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
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
    
    public void terminarPizza(int i) {
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
        if (i == 1) {
            // Begin Expr2
            System.out.println("esperar a queso");
            JRLoop4: while (!ayudanteQuesolisto) {
                {
                    m_condvar m_cv = (prepararPizza);
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
            // Begin Expr2
            ayudanteQuesolisto = false;
            // Begin Expr2
            System.out.println("llamar a queso");
            {
                if (((Boolean) (new Cap_ext_((ponerQueso).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                }
            }
            {
                m_condvar m_cv = (prepararPizza);
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
        } else if (i == 2) {
            // Begin Expr2
            System.out.println("esperar a morron");
            JRLoop5: while (!ayudanteMorronlisto) {
                {
                    m_condvar m_cv = (prepararPizza);
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
            // Begin Expr2
            ayudanteMorronlisto = false;
            // Begin Expr2
            System.out.println("llamar a morron");
            {
                if (((Boolean) (new Cap_ext_((ponerMorron).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                }
            }
            {
                m_condvar m_cv = (prepararPizza);
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
        } else {
            // Begin Expr2
            System.out.println("esperar a salsa");
            JRLoop6: while (!ayudanteSalsalisto) {
                {
                    m_condvar m_cv = (prepararPizza);
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
            // Begin Expr2
            ayudanteSalsalisto = false;
            // Begin Expr2
            System.out.println("llamar a salsa");
            {
                if (((Boolean) (new Cap_ext_((ponerSalsa).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                }
            }
            {
                m_condvar m_cv = (prepararPizza);
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
        // Begin Expr2
        totales++;
        // Begin Expr2
        System.out.println("Pizza terminada. Total pizzas: " + totales);
        // Begin Expr2
        m_next();
    }
    protected boolean JRcalled = false;
    protected JRMonitor jrresref;
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
    	jrresref = new JRMonitor(op_m_urgentq_voidTovoid, op_m_mutex_voidTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
