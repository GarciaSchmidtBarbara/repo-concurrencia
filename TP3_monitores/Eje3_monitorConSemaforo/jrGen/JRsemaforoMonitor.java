/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRsemaforoMonitor
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_ocupado_voidTovoid;
	public Cap_ext_ JRget_op_ocupado_voidTovoid() {
		return op_ocupado_voidTovoid;
	}
	public void JRset_op_ocupado_voidTovoid(Cap_ext_ op_ocupado_voidTovoid) {
		this.op_ocupado_voidTovoid = op_ocupado_voidTovoid;
	}

	public Cap_ext_ op_colaEspera_voidTovoid;
	public Cap_ext_ JRget_op_colaEspera_voidTovoid() {
		return op_colaEspera_voidTovoid;
	}
	public void JRset_op_colaEspera_voidTovoid(Cap_ext_ op_colaEspera_voidTovoid) {
		this.op_colaEspera_voidTovoid = op_colaEspera_voidTovoid;
	}

	public JRsemaforoMonitor(JRsemaforoMonitor copy)
	{
	this.op_ocupado_voidTovoid = copy.op_ocupado_voidTovoid;
	this.op_colaEspera_voidTovoid = copy.op_colaEspera_voidTovoid;

	}
	public JRsemaforoMonitor(Object ... opSig)
	{
	this.op_ocupado_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_colaEspera_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRsemaforoMonitor(boolean dummy)	{
	    super(dummy);
	this.op_ocupado_voidTovoid = Cap_ext_.noop;
	this.op_colaEspera_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRsemaforoMonitor(true);
	}
    }
