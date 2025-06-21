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
	public Cap_ext_ op_pausa_intTovoid;
	public Cap_ext_ JRget_op_pausa_intTovoid() {
		return op_pausa_intTovoid;
	}
	public void JRset_op_pausa_intTovoid(Cap_ext_ op_pausa_intTovoid) {
		this.op_pausa_intTovoid = op_pausa_intTovoid;
	}

	public Cap_ext_ op_Consumer_intTovoid;
	public Cap_ext_ JRget_op_Consumer_intTovoid() {
		return op_Consumer_intTovoid;
	}
	public void JRset_op_Consumer_intTovoid(Cap_ext_ op_Consumer_intTovoid) {
		this.op_Consumer_intTovoid = op_Consumer_intTovoid;
	}

	public Cap_ext_ op_Producer_intTovoid;
	public Cap_ext_ JRget_op_Producer_intTovoid() {
		return op_Producer_intTovoid;
	}
	public void JRset_op_Producer_intTovoid(Cap_ext_ op_Producer_intTovoid) {
		this.op_Producer_intTovoid = op_Producer_intTovoid;
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
	this.op_pausa_intTovoid = copy.op_pausa_intTovoid;
	this.op_Consumer_intTovoid = copy.op_Consumer_intTovoid;
	this.op_Producer_intTovoid = copy.op_Producer_intTovoid;
	this.op_mnjConsume_javadotlangdotStringTovoid = copy.op_mnjConsume_javadotlangdotStringTovoid;
	this.op_mnjProduce_javadotlangdotStringTovoid = copy.op_mnjProduce_javadotlangdotStringTovoid;

	}
	public JRProducerConsumer(Object ... opSig)
	{
	this.op_pausa_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Consumer_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_Producer_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_mnjConsume_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mnjProduce_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRProducerConsumer(boolean dummy)	{
	    super(dummy);
	this.op_pausa_intTovoid = Cap_ext_.noop;
	this.op_Consumer_intTovoid = Cap_ext_.noop;
	this.op_Producer_intTovoid = Cap_ext_.noop;
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
