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
	public Cap_ext_ op_colaCond_voidTovoid;
	public Cap_ext_ JRget_op_colaCond_voidTovoid() {
		return op_colaCond_voidTovoid;
	}
	public void JRset_op_colaCond_voidTovoid(Cap_ext_ op_colaCond_voidTovoid) {
		this.op_colaCond_voidTovoid = op_colaCond_voidTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public JRsemaforoMonitor(JRsemaforoMonitor copy)
	{
	this.op_colaCond_voidTovoid = copy.op_colaCond_voidTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;

	}
	public JRsemaforoMonitor(Object ... opSig)
	{
	this.op_colaCond_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRsemaforoMonitor(boolean dummy)	{
	    super(dummy);
	this.op_colaCond_voidTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;

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
