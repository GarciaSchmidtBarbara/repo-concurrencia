/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


public class Estacionamiento extends java.lang.Object {
    { JRinit(); }
    
    public Estacionamiento() {
        // Begin Expr2
        super();
        JRprocess();
    }
    private static final int A = 60;
    private static final int N = 10;
    private static int totalPB = 0;
    private static int total1P = 0;
    private static int msj = 0;
    private static Op_ext.JRProxyOp JRget_op_mutex_intTovoid()
    {
        return op_mutex_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_mutex_intTovoid;
    ;
    static    {
        try    {
            op_mutex_intTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static Op_ext.JRProxyOp JRget_op_puerta_intTovoid()
    {
        return op_puerta_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_puerta_intTovoid;
    ;
    static    {
        try    {
            op_puerta_intTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static Op_ext.JRProxyOp JRget_op_plantaBaja_intTovoid()
    {
        return op_plantaBaja_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_plantaBaja_intTovoid;
    ;
    static    {
        try    {
            op_plantaBaja_intTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static Op_ext.JRProxyOp JRget_op_plantaAlta_intTovoid()
    {
        return op_plantaAlta_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_plantaAlta_intTovoid;
    ;
    static    {
        try    {
            op_plantaAlta_intTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static Op_ext.JRProxyOp JRget_op_esperaIngreso_intTovoid()
    {
        return op_esperaIngreso_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_esperaIngreso_intTovoid;
    ;
    static    {
        try    {
            op_esperaIngreso_intTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    
    public static void main(String... args) {
        JRget_op_mutex_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
        JRget_op_puerta_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
        JRLoop0: for (int i = 0; i < N; i++) {
            JRget_op_plantaBaja_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
            JRget_op_plantaAlta_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
        }
        Estacionamiento est = new Estacionamiento();
        JRLoop1: while (true) {
            try {
                // Begin Expr2
                Thread.sleep(10000);
            } catch (java.lang.Exception e) {
            }
        }
    }
    private static Op_ext.JRProxyOp JRget_op_Auto_intTovoid()
    {
        return op_Auto_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_Auto_intTovoid;
    static class ProcOp_intTovoid_implAuto extends ProcOp_ext_impl
    {
        public ProcOp_intTovoid_implAuto(Estacionamiento thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                Estacionamiento.AutointTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    Estacionamiento.AutointTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    ;
    static    {
        try    {
            op_Auto_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implAuto(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static void AutointTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_Auto_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void AutointTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                // Receive
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_intTovoid = JRget_op_mutex_intTovoid().recv();
                    msj = (Integer) recv_intTovoid.JRargs[0];
                    jrvm.ariseAndReceive();
                    if (recv_intTovoid.retOp != null)
                        recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                // End Receive
                
                JRLoop2: while ((totalPB + total1P) == (2 * N)) {
                    JRget_op_mutex_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
                    // Begin Expr2
                    System.out.println("Auto " + i + " espera para ingresar. PB = " + totalPB + " , 1P = " + total1P);
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intTovoid = JRget_op_esperaIngreso_intTovoid().recv();
                        msj = (Integer) recv_intTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_intTovoid.retOp != null)
                            recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intTovoid = JRget_op_mutex_intTovoid().recv();
                        msj = (Integer) recv_intTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_intTovoid.retOp != null)
                            recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                }
                // Begin Expr2
                System.out.println("Auto " + i + " puede ingresar");
                if (totalPB < N) {
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intTovoid = JRget_op_plantaBaja_intTovoid().recv();
                        msj = (Integer) recv_intTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_intTovoid.retOp != null)
                            recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Begin Expr2
                    totalPB++;
                    // Begin Expr2
                    System.out.println("Auto " + i + " se estaciona en planta baja. PB = " + totalPB + " , 1P = " + total1P);
                    JRget_op_mutex_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intTovoid = JRget_op_puerta_intTovoid().recv();
                        msj = (Integer) recv_intTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_intTovoid.retOp != null)
                            recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    JRget_op_puerta_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
                    int tiempo = ((int)(Math.random() * 9000));
                    // Begin Expr2
                    (new Cap_ext_(JRget_op_pausa_intTovoid(), "void")).call(jrvm.getTimestamp(), new java.lang.Object [] {tiempo});
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intTovoid = JRget_op_puerta_intTovoid().recv();
                        msj = (Integer) recv_intTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_intTovoid.retOp != null)
                            recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Begin Expr2
                    System.out.println("Auto " + i + " se va");
                    JRget_op_puerta_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intTovoid = JRget_op_mutex_intTovoid().recv();
                        msj = (Integer) recv_intTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_intTovoid.retOp != null)
                            recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Begin Expr2
                    totalPB--;
                    JRget_op_mutex_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
                } else {
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intTovoid = JRget_op_plantaAlta_intTovoid().recv();
                        msj = (Integer) recv_intTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_intTovoid.retOp != null)
                            recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Begin Expr2
                    total1P++;
                    // Begin Expr2
                    System.out.println("Auto " + i + " se estaciona en planta alta. PB = " + totalPB + " , 1P = " + total1P);
                    JRget_op_mutex_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intTovoid = JRget_op_puerta_intTovoid().recv();
                        msj = (Integer) recv_intTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_intTovoid.retOp != null)
                            recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    JRget_op_puerta_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
                    int tiempo = ((int)(Math.random() * 9000));
                    // Begin Expr2
                    (new Cap_ext_(JRget_op_pausa_intTovoid(), "void")).call(jrvm.getTimestamp(), new java.lang.Object [] {tiempo});
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intTovoid = JRget_op_puerta_intTovoid().recv();
                        msj = (Integer) recv_intTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_intTovoid.retOp != null)
                            recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Begin Expr2
                    System.out.println("Auto " + i + " se va");
                    JRget_op_puerta_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_intTovoid = JRget_op_mutex_intTovoid().recv();
                        msj = (Integer) recv_intTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_intTovoid.retOp != null)
                            recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Begin Expr2
                    total1P--;
                    JRget_op_mutex_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {msj});
                }
                // Begin Expr2
                System.out.println("TOTALES PB = " + totalPB + " , 1P = " + total1P);
                // Return
                { if (retOp != null)
                    retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, null);
                return ; }
                // End Return

            }
        } catch (Exception JRe)    {
            if (retOp != null && fretOp == null)
            {
        	// if it is a forward cocall with handler
        	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
        	    handler.JRhandler(JRe);
        	else
        	    // give preference to propagation through the call stack
        	    retOp.send(jrvm.getTimestamp(), JRe);
            }
            else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// for COSTMT exception handling in operation
        	if (handler != null)
        	    handler.JRhandler(JRe);
        	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
            }
            else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// this should only be for a send/forward
        	handler.JRhandler(JRe);
        	// can rethrow below just to get out of this method
            }
            // rethrow the proper type of exception
            // catch all
            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
        }
    }
    static {
        try {
            for (int i = A; i < A; i++) {
                op_Auto_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
            }
        } catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    };
    
    
    private static void pausaintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_pausa_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void pausaintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int tiempo = ((Number) JRargs[0]).intValue();
            {
                try {
                    // Begin Expr2
                    Thread.sleep(tiempo);
                } catch (java.lang.Exception e) {
                }
                // Return
                { if (retOp != null)
                    retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, null);
                return ; }
                // End Return

            }
        } catch (Exception JRe)    {
            if (retOp != null && fretOp == null)
            {
        	// if it is a forward cocall with handler
        	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
        	    handler.JRhandler(JRe);
        	else
        	    // give preference to propagation through the call stack
        	    retOp.send(jrvm.getTimestamp(), JRe);
            }
            else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// for COSTMT exception handling in operation
        	if (handler != null)
        	    handler.JRhandler(JRe);
        	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
            }
            else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// this should only be for a send/forward
        	handler.JRhandler(JRe);
        	// can rethrow below just to get out of this method
            }
            // rethrow the proper type of exception
            // catch all
            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
        }
    }
    private static Op_ext.JRProxyOp JRget_op_pausa_intTovoid()
    {
        return op_pausa_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_pausa_intTovoid;
    static class ProcOp_intTovoid_implpausa extends ProcOp_ext_impl
    {
        public ProcOp_intTovoid_implpausa(Estacionamiento thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                Estacionamiento.pausaintTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    Estacionamiento.pausaintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    ;
    static    {
        try    {
            op_pausa_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implpausa(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    protected boolean JRcalled = false;
    protected JREstacionamiento jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JREstacionamiento(op_pausa_intTovoid, op_Auto_intTovoid, op_esperaIngreso_intTovoid, op_plantaAlta_intTovoid, op_plantaBaja_intTovoid, op_puerta_intTovoid, op_mutex_intTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
