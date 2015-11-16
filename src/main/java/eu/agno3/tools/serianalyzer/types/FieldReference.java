/**
 * © 2015 AgNO3 Gmbh & Co. KG
 * All right reserved.
 * 
 * Created: 12.11.2015 by mbechler
 */
package eu.agno3.tools.serianalyzer.types;


import org.jboss.jandex.DotName;
import org.objectweb.asm.Type;


/**
 * @author mbechler
 *
 */
public class FieldReference extends BaseType implements SimpleType {

    private DotName owner;
    private String name;
    private Type type;
    private boolean isThis;


    /**
     * @param owner
     * @param name
     * @param t
     * @param tainted
     */
    public FieldReference ( DotName owner, String name, Type t, boolean tainted ) {
        this(owner, name, t, tainted, false);
    }


    /**
     * @param owner
     * @param name
     * @param t
     * @param tainted
     * @param isThis
     */
    public FieldReference ( DotName owner, String name, Type t, boolean tainted, boolean isThis ) {
        super(tainted, String.format("%s->%s (%s)", owner, name, t)); //$NON-NLS-1$
        this.owner = owner;
        this.name = name;
        this.type = t;
        this.isThis = isThis;
    }


    /**
     * @return the owner
     */
    public DotName getOwner () {
        return this.owner;
    }


    /**
     * @return the name
     */
    public String getName () {
        return this.name;
    }


    /**
     * @return the type
     */
    @Override
    public Type getType () {
        return this.type;
    }


    /**
     * @return the isThis
     */
    public boolean isThis () {
        return this.isThis;
    }
}
