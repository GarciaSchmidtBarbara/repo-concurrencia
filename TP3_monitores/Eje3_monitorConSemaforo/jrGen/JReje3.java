/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JReje3
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_done_voidTovoid;
	public Cap_ext_ JRget_op_done_voidTovoid() {
		return op_done_voidTovoid;
	}
	public void JRset_op_done_voidTovoid(Cap_ext_ op_done_voidTovoid) {
		this.op_done_voidTovoid = op_done_voidTovoid;
	}

	public Cap_ext_ op_delay_intTovoid;
	public Cap_ext_ JRget_op_delay_intTovoid() {
		return op_delay_intTovoid;
	}
	public void JRset_op_delay_intTovoid(Cap_ext_ op_delay_intTovoid) {
		this.op_delay_intTovoid = op_delay_intTovoid;
	}

	public Cap_ext_ op_User2_voidTovoid;
	public Cap_ext_ JRget_op_User2_voidTovoid() {
		return op_User2_voidTovoid;
	}
	public void JRset_op_User2_voidTovoid(Cap_ext_ op_User2_voidTovoid) {
		this.op_User2_voidTovoid = op_User2_voidTovoid;
	}

	public Cap_ext_ op_User1_voidTovoid;
	public Cap_ext_ JRget_op_User1_voidTovoid() {
		return op_User1_voidTovoid;
	}
	public void JRset_op_User1_voidTovoid(Cap_ext_ op_User1_voidTovoid) {
		this.op_User1_voidTovoid = op_User1_voidTovoid;
	}

	public JReje3(JReje3 copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_delay_intTovoid = copy.op_delay_intTovoid;
	this.op_User2_voidTovoid = copy.op_User2_voidTovoid;
	this.op_User1_voidTovoid = copy.op_User1_voidTovoid;

	}
	public JReje3(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_delay_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_User2_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_User1_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JReje3(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_delay_intTovoid = Cap_ext_.noop;
	this.op_User2_voidTovoid = Cap_ext_.noop;
	this.op_User1_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JReje3(true);
	}
    }
