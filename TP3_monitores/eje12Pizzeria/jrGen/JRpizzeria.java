/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRpizzeria
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

	public Cap_ext_ op_Ayudante3_voidTovoid;
	public Cap_ext_ JRget_op_Ayudante3_voidTovoid() {
		return op_Ayudante3_voidTovoid;
	}
	public void JRset_op_Ayudante3_voidTovoid(Cap_ext_ op_Ayudante3_voidTovoid) {
		this.op_Ayudante3_voidTovoid = op_Ayudante3_voidTovoid;
	}

	public Cap_ext_ op_Ayudante2_voidTovoid;
	public Cap_ext_ JRget_op_Ayudante2_voidTovoid() {
		return op_Ayudante2_voidTovoid;
	}
	public void JRset_op_Ayudante2_voidTovoid(Cap_ext_ op_Ayudante2_voidTovoid) {
		this.op_Ayudante2_voidTovoid = op_Ayudante2_voidTovoid;
	}

	public Cap_ext_ op_Ayudante1_voidTovoid;
	public Cap_ext_ JRget_op_Ayudante1_voidTovoid() {
		return op_Ayudante1_voidTovoid;
	}
	public void JRset_op_Ayudante1_voidTovoid(Cap_ext_ op_Ayudante1_voidTovoid) {
		this.op_Ayudante1_voidTovoid = op_Ayudante1_voidTovoid;
	}

	public Cap_ext_ op_Chef_voidTovoid;
	public Cap_ext_ JRget_op_Chef_voidTovoid() {
		return op_Chef_voidTovoid;
	}
	public void JRset_op_Chef_voidTovoid(Cap_ext_ op_Chef_voidTovoid) {
		this.op_Chef_voidTovoid = op_Chef_voidTovoid;
	}

	public JRpizzeria(JRpizzeria copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_delay_intTovoid = copy.op_delay_intTovoid;
	this.op_Ayudante3_voidTovoid = copy.op_Ayudante3_voidTovoid;
	this.op_Ayudante2_voidTovoid = copy.op_Ayudante2_voidTovoid;
	this.op_Ayudante1_voidTovoid = copy.op_Ayudante1_voidTovoid;
	this.op_Chef_voidTovoid = copy.op_Chef_voidTovoid;

	}
	public JRpizzeria(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_delay_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_Ayudante3_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_Ayudante2_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_Ayudante1_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_Chef_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);

	}
	public JRpizzeria(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_delay_intTovoid = Cap_ext_.noop;
	this.op_Ayudante3_voidTovoid = Cap_ext_.noop;
	this.op_Ayudante2_voidTovoid = Cap_ext_.noop;
	this.op_Ayudante1_voidTovoid = Cap_ext_.noop;
	this.op_Chef_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRpizzeria(true);
	}
    }
