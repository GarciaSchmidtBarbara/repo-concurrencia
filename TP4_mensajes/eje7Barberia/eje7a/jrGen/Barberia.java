/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


public class Barberia extends java.lang.Object {
    { JRinit(); }
    
    public Barberia() {
        // Begin Expr2
        super();
        JRprocess();
    }
    private static final int N = 5;
    private static final int M = 10;
    private static int clientesEsperando = 0;
    private static Op_ext.JRProxyOp JRget_op_mutex_javadotlangdotStringTovoid()
    {
        return op_mutex_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_mutex_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_mutex_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static Op_ext.JRProxyOp JRget_op_barbero_javadotlangdotStringTovoid()
    {
        return op_barbero_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_barbero_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_barbero_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static Op_ext.JRProxyOp JRget_op_cliente_javadotlangdotStringTovoid()
    {
        return op_cliente_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_cliente_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_cliente_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static Op_ext.JRProxyOp JRget_op_puedoEsperar_javadotlangdotStringTovoid()
    {
        return op_puedoEsperar_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_puedoEsperar_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_puedoEsperar_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    
    public static void main(String... args) {
        JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {" "});
        Barberia b = new Barberia();
    }
    private static Op_ext.JRProxyOp JRget_op_Barbero_voidTovoid()
    {
        return op_Barbero_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_Barbero_voidTovoid;
    static class ProcOp_voidTovoid_implBarbero extends ProcOp_ext_impl
    {
        public ProcOp_voidTovoid_implBarbero(Barberia thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                Barberia.BarberovoidTovoid(null, null, null, JRargs);
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
                    Barberia.BarberovoidTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
            op_Barbero_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implBarbero(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static void BarberovoidTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_Barbero_voidTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void BarberovoidTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            {
                String aux = /*JR init for inni*/ null;
                JRLoop0: while (true) {
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_mutex_javadotlangdotStringTovoid().recv();
                        aux = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    if (clientesEsperando == 0) {
                        JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                        // Begin Expr2
                        System.out.println("Barbero durmiendo");
                        // Receive
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_javadotlangdotStringTovoid = JRget_op_barbero_javadotlangdotStringTovoid().recv();
                            aux = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                            jrvm.ariseAndReceive();
                            if (recv_javadotlangdotStringTovoid.retOp != null)
                                recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                        // End Receive
                        
                    } else if (clientesEsperando == 1) {
                        JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                        // Receive
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_javadotlangdotStringTovoid = JRget_op_barbero_javadotlangdotStringTovoid().recv();
                            aux = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                            jrvm.ariseAndReceive();
                            if (recv_javadotlangdotStringTovoid.retOp != null)
                                recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                        // End Receive
                        
                    } else {
                        JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                        JRget_op_puedoEsperar_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    }
                    // Begin Expr2
                    System.out.println("Barbero despierto esperando al cliente en el sillon");
                    JRget_op_cliente_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_barbero_javadotlangdotStringTovoid().recv();
                        aux = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Begin Expr2
                    System.out.println("Barbero cortando el pelo");
                    // Begin Expr2
                    (new Cap_ext_(JRget_op_pausa_intTovoid(), "void")).call(jrvm.getTimestamp(), new java.lang.Object [] {2000});
                    JRget_op_cliente_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    // Begin Expr2
                    System.out.println("Barbero termino de cortar el pelo");
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_barbero_javadotlangdotStringTovoid().recv();
                        aux = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                }
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
            op_Barbero_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
        } catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    };
    
    private static Op_ext.JRProxyOp JRget_op_Cliente_intTovoid()
    {
        return op_Cliente_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_Cliente_intTovoid;
    static class ProcOp_intTovoid_implCliente extends ProcOp_ext_impl
    {
        public ProcOp_intTovoid_implCliente(Barberia thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                Barberia.ClienteintTovoid(null, null, null, JRargs);
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
                    Barberia.ClienteintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
            op_Cliente_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implCliente(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static void ClienteintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_Cliente_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void ClienteintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                String aux = /*JR init for inni*/ null;
                // Receive
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_javadotlangdotStringTovoid = JRget_op_mutex_javadotlangdotStringTovoid().recv();
                    aux = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                    jrvm.ariseAndReceive();
                    if (recv_javadotlangdotStringTovoid.retOp != null)
                        recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                // End Receive
                
                if (clientesEsperando < N) {
                    // Begin Expr2
                    clientesEsperando++;
                    // Begin Expr2
                    System.out.println("Cliente " + i + " espera en la barberia");
                    if (clientesEsperando == 1) {
                        JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                        // Begin Expr2
                        System.out.println("Cliente " + i + " despierta al barbero");
                        JRget_op_barbero_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    } else {
                        JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                        // Receive
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_javadotlangdotStringTovoid = JRget_op_puedoEsperar_javadotlangdotStringTovoid().recv();
                            aux = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                            jrvm.ariseAndReceive();
                            if (recv_javadotlangdotStringTovoid.retOp != null)
                                recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                        // End Receive
                        
                    }
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_cliente_javadotlangdotStringTovoid().recv();
                        aux = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_mutex_javadotlangdotStringTovoid().recv();
                        aux = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Begin Expr2
                    clientesEsperando--;
                    JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    // Begin Expr2
                    System.out.println("Cliente " + i + " se sienta en el sillon");
                    JRget_op_barbero_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_cliente_javadotlangdotStringTovoid().recv();
                        aux = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Begin Expr2
                    System.out.println("Cliente " + i + " se levanta del sillon y se va a su casa");
                    // Begin Expr2
                    (new Cap_ext_(JRget_op_pausa_intTovoid(), "void")).call(jrvm.getTimestamp(), new java.lang.Object [] {1000});
                    JRget_op_barbero_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                } else {
                    JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    // Begin Expr2
                    System.out.println("Cliente " + i + " no puede esperar, se va a su casa");
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
    static {
        try {
            for (int i = 0; i < M; i++) {
                op_Cliente_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
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
        public ProcOp_intTovoid_implpausa(Barberia thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                Barberia.pausaintTovoid(null, null, null, JRargs);
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
                    Barberia.pausaintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
    protected JRBarberia jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRBarberia(op_pausa_intTovoid, op_Cliente_intTovoid, op_Barbero_voidTovoid, op_puedoEsperar_javadotlangdotStringTovoid, op_cliente_javadotlangdotStringTovoid, op_barbero_javadotlangdotStringTovoid, op_mutex_javadotlangdotStringTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
