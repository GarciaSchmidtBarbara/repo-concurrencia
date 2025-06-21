/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRProducerConsumer
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_Consumer_voidTovoid;
	public Cap_ext_ JRget_op_Consumer_voidTovoid() {
		return op_Consumer_voidTovoid;
	}
	public void JRset_op_Consumer_voidTovoid(Cap_ext_ op_Consumer_voidTovoid) {
		this.op_Consumer_voidTovoid = op_Consumer_voidTovoid;
	}

	public Cap_ext_ op_Producer_voidTovoid;
	public Cap_ext_ JRget_op_Producer_voidTovoid() {
		return op_Producer_voidTovoid;
	}
	public void JRset_op_Producer_voidTovoid(Cap_ext_ op_Producer_voidTovoid) {
		this.op_Producer_voidTovoid = op_Producer_voidTovoid;
	}

	public Cap_ext_ op_mnjConsume_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_mnjConsume_javadotlangdotStringTovoid() {
		return op_mnjConsume_javadotlangdotStringTovoid;
	}
	public void JRset_op_mnjConsume_javadotlangdotStringTovoid(Cap_ext_ op_mnjConsume_javadotlangdotStringTovoid) {
		this.op_mnjConsume_javadotlangdotStringTovoid = op_mnjConsume_javadotlangdotStringTovoid;
	}

	public Cap_ext_ op_mnjProduce_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_mnjProduce_javadotlangdotStringTovoid() {
		return op_mnjProduce_javadotlangdotStringTovoid;
	}
	public void JRset_op_mnjProduce_javadotlangdotStringTovoid(Cap_ext_ op_mnjProduce_javadotlangdotStringTovoid) {
		this.op_mnjProduce_javadotlangdotStringTovoid = op_mnjProduce_javadotlangdotStringTovoid;
	}

	public JRProducerConsumer(JRProducerConsumer copy)
	{
	this.op_Consumer_voidTovoid = copy.op_Consumer_voidTovoid;
	this.op_Producer_voidTovoid = copy.op_Producer_voidTovoid;
	this.op_mnjConsume_javadotlangdotStringTovoid = copy.op_mnjConsume_javadotlangdotStringTovoid;
	this.op_mnjProduce_javadotlangdotStringTovoid = copy.op_mnjProduce_javadotlangdotStringTovoid;

	}
	public JRProducerConsumer(Object ... opSig)
	{
	this.op_Consumer_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Producer_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_mnjConsume_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_mnjProduce_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JRProducerConsumer(boolean dummy)	{
	    super(dummy);
	this.op_Consumer_voidTovoid = Cap_ext_.noop;
	this.op_Producer_voidTovoid = Cap_ext_.noop;
	this.op_mnjConsume_javadotlangdotStringTovoid = Cap_ext_.noop;
	this.op_mnjProduce_javadotlangdotStringTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRProducerConsumer(true);
	}
    }
