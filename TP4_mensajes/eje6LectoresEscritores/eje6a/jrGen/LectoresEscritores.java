/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


public class LectoresEscritores extends java.lang.Object {
    { JRinit(); }
    
    public LectoresEscritores() {
        // Begin Expr2
        super();
        JRprocess();
    }
    private static final int N = 8;
    private static final int M = 5;
    private static String data = "";
    private static Op_ext.JRProxyOp JRget_op_mnjLector_javadotlangdotStringTovoid()
    {
        return op_mnjLector_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_mnjLector_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_mnjLector_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    private static Op_ext.JRProxyOp JRget_op_mnjEscritor_javadotlangdotStringTovoid()
    {
        return op_mnjEscritor_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_mnjEscritor_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_mnjEscritor_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
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
    
    private static int cantLectores = 0;
    private static int cantEscritores = 0;
    private static int lectoresEsperando = 0;
    private static int escritoresEsperando = 0;
    
    public static void main(String... args) {
        JRget_op_mnjEscritor_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {" "});
        JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {" "});
        LectoresEscritores le = new LectoresEscritores();
    }
    private Op_ext.JRProxyOp JRget_op_Escritor_intTovoid()
    {
        return op_Escritor_intTovoid;
    }
    
    public Op_ext.JRProxyOp op_Escritor_intTovoid;
    class ProcOp_intTovoid_implEscritor extends ProcOp_ext_impl
    {
        LectoresEscritores thisarg;
        public ProcOp_intTovoid_implEscritor(LectoresEscritores thisIn) throws RemoteException
        {
        thisarg = thisIn;
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                thisarg.EscritorintTovoid(null, null, null, JRargs);
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
                    thisarg.EscritorintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
    
    private void EscritorintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_Escritor_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private void EscritorintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                String aux = /*JR init for inni*/ null;
                JRLoop1: while (true) {
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
                    escritoresEsperando++;
                    JRLoop0: while (cantEscritores > 0 || cantLectores > 0) {
                        JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                        // Receive
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_javadotlangdotStringTovoid = JRget_op_mnjEscritor_javadotlangdotStringTovoid().recv();
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
                        
                    }
                    // Begin Expr2
                    cantEscritores++;
                    // Begin Expr2
                    escritoresEsperando--;
                    JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    // Begin Expr2
                    data = "msg del escritor " + i;
                    // Begin Expr2
                    System.out.println("Escritor " + i + " manda mensaje");
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
                    cantEscritores--;
                    if (lectoresEsperando > 0) {
                        JRget_op_mnjLector_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    } else if (escritoresEsperando > 0) {
                        JRget_op_mnjEscritor_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    }
                    JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    // Begin Expr2
                    System.out.println("Escritor " + i + " termina de escribir");
                    // Begin Expr2
                    (new Cap_ext_(JRget_op_pausa_intTovoid(), "void")).call(jrvm.getTimestamp(), new java.lang.Object [] {1000});
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
    
    private Op_ext.JRProxyOp JRget_op_Lector_intTovoid()
    {
        return op_Lector_intTovoid;
    }
    
    public Op_ext.JRProxyOp op_Lector_intTovoid;
    class ProcOp_intTovoid_implLector extends ProcOp_ext_impl
    {
        LectoresEscritores thisarg;
        public ProcOp_intTovoid_implLector(LectoresEscritores thisIn) throws RemoteException
        {
        thisarg = thisIn;
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                thisarg.LectorintTovoid(null, null, null, JRargs);
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
                    thisarg.LectorintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
    
    private void LectorintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_Lector_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private void LectorintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                String aux = /*JR init for inni*/ null;
                JRLoop3: while (true) {
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
                    lectoresEsperando++;
                    JRLoop2: while (cantEscritores > 0) {
                        JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                        // Receive
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_javadotlangdotStringTovoid = JRget_op_mnjLector_javadotlangdotStringTovoid().recv();
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
                        
                    }
                    // Begin Expr2
                    cantLectores++;
                    // Begin Expr2
                    lectoresEsperando--;
                    JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    // Begin Expr2
                    System.out.println("Lector " + i + " lee mensaje: " + data);
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
                    cantLectores--;
                    if (lectoresEsperando > 0) {
                        JRget_op_mnjLector_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    } else if (escritoresEsperando > 0 && cantLectores == 0) {
                        JRget_op_mnjEscritor_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    }
                    JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    // Begin Expr2
                    (new Cap_ext_(JRget_op_pausa_intTovoid(), "void")).call(jrvm.getTimestamp(), new java.lang.Object [] {1000});
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
        public ProcOp_intTovoid_implpausa(LectoresEscritores thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                LectoresEscritores.pausaintTovoid(null, null, null, JRargs);
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
                    LectoresEscritores.pausaintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
    protected JRLectoresEscritores jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_Lector_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implLector(this));
    	op_Escritor_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implEscritor(this));
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRLectoresEscritores(op_pausa_intTovoid, op_Lector_intTovoid, op_Escritor_intTovoid, op_mutex_javadotlangdotStringTovoid, op_mnjEscritor_javadotlangdotStringTovoid, op_mnjLector_javadotlangdotStringTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    	try {
    	  for (int i = 0; i < M; i++) 
    	  {
    		op_Lector_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
    	  }
    	  for (int i = 0; i < N; i++) 
    	  {
    		op_Escritor_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
    	  }
    	} catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    }
}
