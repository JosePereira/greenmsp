
package gram.i.types.argumentosassert;



public final class ConsListaArgsAssert extends gram.i.types.argumentosassert.ListaArgsAssert implements tom.library.sl.Visitable  {
  
  private static String symbolName = "ConsListaArgsAssert";


  private ConsListaArgsAssert() {}
  private int hashCode;
  private static ConsListaArgsAssert gomProto = new ConsListaArgsAssert();
  
   private gram.i.types.ArgumentosAssert[] children;
                  private gram.i.types.ArgumentosAssert _HeadListaArgsAssert;
  private gram.i.types.ArgumentosAssert _TailListaArgsAssert;

  /**
   * Constructor that builds a term rooted by ConsListaArgsAssert
   *
   * @return a term rooted by ConsListaArgsAssert
   */

    public static gram.i.types.ArgumentosAssert make(gram.i.types.ArgumentosAssert head, gram.i.types.ArgumentosAssert tail) {
  if (true) {if (head.isEmptyListaArgsAssert()) { return tail; }
if (head.isConsListaArgsAssert()) { return make(head.getHeadListaArgsAssert(),make(head.getTailListaArgsAssert(),tail)); }
if (!tail.isConsListaArgsAssert() && !tail.isEmptyListaArgsAssert()) { return make(head,make(tail,EmptyListaArgsAssert.make())); }
}
      return realMake( head,  tail);
    }
  
  private static ConsListaArgsAssert realMake(gram.i.types.ArgumentosAssert _HeadListaArgsAssert, gram.i.types.ArgumentosAssert _TailListaArgsAssert) {

    // use the proto as a model
    gomProto.initHashCode( _HeadListaArgsAssert,  _TailListaArgsAssert);
    return (ConsListaArgsAssert) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadListaArgsAssert
   * @param _TailListaArgsAssert
   * @param hashCode hashCode of ConsListaArgsAssert
   */
  private void init(gram.i.types.ArgumentosAssert _HeadListaArgsAssert, gram.i.types.ArgumentosAssert _TailListaArgsAssert, int hashCode) {
    this._HeadListaArgsAssert = _HeadListaArgsAssert;
    this._TailListaArgsAssert = _TailListaArgsAssert;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadListaArgsAssert
   * @param _TailListaArgsAssert
   */
  private void initHashCode(gram.i.types.ArgumentosAssert _HeadListaArgsAssert, gram.i.types.ArgumentosAssert _TailListaArgsAssert) {
    this._HeadListaArgsAssert = _HeadListaArgsAssert;
    this._TailListaArgsAssert = _TailListaArgsAssert;

    this.hashCode = hashFunction();
  }

  /* name and arity */

  /**
   * Returns the name of the symbol
   *
   * @return the name of the symbol
   */
  @Override
  public String symbolName() {
    return "ConsListaArgsAssert";
  }

  /**
   * Returns the arity of the symbol
   *
   * @return the arity of the symbol
   */
  private int getArity() {
    return 2;
  }

  /**
   * Copy the object and returns the copy
   *
   * @return a clone of the SharedObject
   */
  public shared.SharedObject duplicate() {
    ConsListaArgsAssert clone = new ConsListaArgsAssert();
    clone.init( _HeadListaArgsAssert,  _TailListaArgsAssert, hashCode);
    return clone;
  }
  

  /**
   * Compares two terms. This functions implements a total lexicographic path ordering.
   *
   * @param o object to which this term is compared
   * @return a negative integer, zero, or a positive integer as this
   *         term is less than, equal to, or greater than the argument
   * @throws ClassCastException in case of invalid arguments
   * @throws RuntimeException if unable to compare children
   */
  @Override
  public int compareToLPO(Object o) {
    /*
     * We do not want to compare with any object, only members of the module
     * In case of invalid argument, throw a ClassCastException, as the java api
     * asks for it
     */
    gram.i.iAbstractType ao = (gram.i.iAbstractType) o;
    /* return 0 for equality */
    if (ao == this) { return 0; }
    /* compare the symbols */
    int symbCmp = this.symbolName().compareTo(ao.symbolName());
    if (symbCmp != 0) { return symbCmp; }
    /* compare the children */
    ConsListaArgsAssert tco = (ConsListaArgsAssert) ao;
    int _HeadListaArgsAssertCmp = (this._HeadListaArgsAssert).compareToLPO(tco._HeadListaArgsAssert);
    if(_HeadListaArgsAssertCmp != 0) {
      return _HeadListaArgsAssertCmp;
    }

    int _TailListaArgsAssertCmp = (this._TailListaArgsAssert).compareToLPO(tco._TailListaArgsAssert);
    if(_TailListaArgsAssertCmp != 0) {
      return _TailListaArgsAssertCmp;
    }

    throw new RuntimeException("Unable to compare");
  }

 /**
   * Compares two terms. This functions implements a total order.
   *
   * @param o object to which this term is compared
   * @return a negative integer, zero, or a positive integer as this
   *         term is less than, equal to, or greater than the argument
   * @throws ClassCastException in case of invalid arguments
   * @throws RuntimeException if unable to compare children
   */
  @Override
  public int compareTo(Object o) {
    /*
     * We do not want to compare with any object, only members of the module
     * In case of invalid argument, throw a ClassCastException, as the java api
     * asks for it
     */
    gram.i.iAbstractType ao = (gram.i.iAbstractType) o;
    /* return 0 for equality */
    if (ao == this) { return 0; }
    /* use the hash values to discriminate */

    if(hashCode != ao.hashCode()) { return (hashCode < ao.hashCode())?-1:1; }

    /* If not, compare the symbols : back to the normal order */
    int symbCmp = this.symbolName().compareTo(ao.symbolName());
    if (symbCmp != 0) { return symbCmp; }
    /* last resort: compare the children */
    ConsListaArgsAssert tco = (ConsListaArgsAssert) ao;
    int _HeadListaArgsAssertCmp = (this._HeadListaArgsAssert).compareTo(tco._HeadListaArgsAssert);
    if(_HeadListaArgsAssertCmp != 0) {
      return _HeadListaArgsAssertCmp;
    }

    int _TailListaArgsAssertCmp = (this._TailListaArgsAssert).compareTo(tco._TailListaArgsAssert);
    if(_TailListaArgsAssertCmp != 0) {
      return _TailListaArgsAssertCmp;
    }

    throw new RuntimeException("Unable to compare");
  }

 //shared.SharedObject
  /**
   * Returns hashCode
   *
   * @return hashCode
   */
  @Override
  public final int hashCode() {
    return hashCode;
  }

  /**
   * Checks if a SharedObject is equivalent to the current object
   *
   * @param obj SharedObject to test
   * @return true if obj is a ConsListaArgsAssert and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof ConsListaArgsAssert) {

      ConsListaArgsAssert peer = (ConsListaArgsAssert) obj;
      return _HeadListaArgsAssert==peer._HeadListaArgsAssert && _TailListaArgsAssert==peer._TailListaArgsAssert && true;
    }
    return false;
  }


   //ArgumentosAssert interface
  /**
   * Returns true if the term is rooted by the symbol ConsListaArgsAssert
   *
   * @return true, because this is rooted by ConsListaArgsAssert
   */
  @Override
  public boolean isConsListaArgsAssert() {
    return true;
  }
  
  /**
   * Returns the attribute gram.i.types.ArgumentosAssert
   *
   * @return the attribute gram.i.types.ArgumentosAssert
   */
  @Override
  public gram.i.types.ArgumentosAssert getHeadListaArgsAssert() {
    return _HeadListaArgsAssert;
  }

  /**
   * Sets and returns the attribute gram.i.types.ArgumentosAssert
   *
   * @param set_arg the argument to set
   * @return the attribute gram.i.types.ArgumentosAssert which just has been set
   */
  @Override
  public gram.i.types.ArgumentosAssert setHeadListaArgsAssert(gram.i.types.ArgumentosAssert set_arg) {
    return make(set_arg, _TailListaArgsAssert);
  }
  
  /**
   * Returns the attribute gram.i.types.ArgumentosAssert
   *
   * @return the attribute gram.i.types.ArgumentosAssert
   */
  @Override
  public gram.i.types.ArgumentosAssert getTailListaArgsAssert() {
    return _TailListaArgsAssert;
  }

  /**
   * Sets and returns the attribute gram.i.types.ArgumentosAssert
   *
   * @param set_arg the argument to set
   * @return the attribute gram.i.types.ArgumentosAssert which just has been set
   */
  @Override
  public gram.i.types.ArgumentosAssert setTailListaArgsAssert(gram.i.types.ArgumentosAssert set_arg) {
    return make(_HeadListaArgsAssert, set_arg);
  }
  
  /* AbstractType */
  /**
   * Returns an ATerm representation of this term.
   *
   * @return an ATerm representation of this term.
   */
  @Override
  public aterm.ATerm toATerm() {
    aterm.ATerm res = super.toATerm();
    if(res != null) {
      // the super class has produced an ATerm (may be a variadic operator)
      return res;
    }
    return atermFactory.makeAppl(
      atermFactory.makeAFun(symbolName(),getArity(),false),
      new aterm.ATerm[] {getHeadListaArgsAssert().toATerm(), getTailListaArgsAssert().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a gram.i.types.ArgumentosAssert from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static gram.i.types.ArgumentosAssert fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
gram.i.types.ArgumentosAssert.fromTerm(appl.getArgument(0),atConv), gram.i.types.ArgumentosAssert.fromTerm(appl.getArgument(1),atConv)
        );
      }
    }
    return null;
  }

  /* Visitable */
  /**
   * Returns the number of children of the term
   *
   * @return the number of children of the term
   */
  public int getChildCount() {
    return getChildren().length;
  }

  /**
   * Returns the child at the specified index
   *
   * @param index index of the child to return; must be
             nonnegative and less than the childCount
   * @return the child at the specified index
   * @throws IndexOutOfBoundsException if the index out of range
   */
  public tom.library.sl.Visitable getChildAt(int index) {
    return getChildren()[index];
 }

  /**
   * Set the child at the specified index
   *
   * @param index index of the child to set; must be
             nonnegative and less than the childCount
   * @param v child to set at the specified index
   * @return the child which was just set
   * @throws IndexOutOfBoundsException if the index out of range
   */
  public tom.library.sl.Visitable setChildAt(int index, tom.library.sl.Visitable v) {
    
      tom.library.sl.Visitable[] children = getChildren();
      gram.i.types.ArgumentosAssert[] new_children = new gram.i.types.ArgumentosAssert[children.length];
      for(int i =0; i<children.length; i++) {
        new_children[i] = ((gram.i.types.ArgumentosAssert) children[i]); 
      }
     new_children[index] = (gram.i.types.ArgumentosAssert) v;
     return fromArray(new_children);
                  
  }

  /**
   * Set children to the term
   *
   * @param children array of children to set
   * @return an array of children which just were set
   * @throws IndexOutOfBoundsException if length of "children" is different than 2
   */
  @SuppressWarnings("unchecked")
  public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] children) {
    if (children.length == getChildCount() ) {
      
               gram.i.types.ArgumentosAssert[] typed_children = new gram.i.types.ArgumentosAssert[children.length];
              for (int i=0; i<children.length; i++) {
                typed_children[i] = (gram.i.types.ArgumentosAssert) children[i]; 
              }
              return fromArray(typed_children);
              
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  /**
   * Returns the whole children of the term
   *
   * @return the children of the term
   */
  public tom.library.sl.Visitable[] getChildren() {
    
        if (children == null) {
          children = toArray(new gram.i.types.ArgumentosAssert[]{});
        }
        return java.util.Arrays.copyOf(children,children.length);
      
  }

    /**
     * Compute a hashcode for this term.
     * (for internal use)
     *
     * @return a hash value
     */
  protected int hashFunction() {
    int a, b, c;
    /* Set up the internal state */
    a = 0x9e3779b9; /* the golden ratio; an arbitrary value */
    b = (-1045580808<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_HeadListaArgsAssert.hashCode() << 8);
    a += (_TailListaArgsAssert.hashCode());

    a -= b; a -= c; a ^= (c >> 13);
    b -= c; b -= a; b ^= (a << 8);
    c -= a; c -= b; c ^= (b >> 13);
    a -= b; a -= c; a ^= (c >> 12);
    b -= c; b -= a; b ^= (a << 16);
    c -= a; c -= b; c ^= (b >> 5);
    a -= b; a -= c; a ^= (c >> 3);
    b -= c; b -= a; b ^= (a << 10);
    c -= a; c -= b; c ^= (b >> 15);
    /* ------------------------------------------- report the result */
    return c;
  }

  /**
    * function that returns functional version of the current operator
    * need for initializing the Enumerator
    */
  public static tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>,tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>,tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>>> funMake() {
    return 
        new tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>,tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>,tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>>>() {
          public tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>,tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>> apply(final tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert> t1) {
            return 
        new tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>,tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>>() {
          public tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert> apply(final tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert> t2) {
            return tom.library.enumerator.Enumeration.apply(tom.library.enumerator.Enumeration.apply(tom.library.enumerator.Enumeration.singleton((tom.library.enumerator.F<gram.i.types.ArgumentosAssert,tom.library.enumerator.F<gram.i.types.ArgumentosAssert,gram.i.types.ArgumentosAssert>>) 
        new tom.library.enumerator.F<gram.i.types.ArgumentosAssert,tom.library.enumerator.F<gram.i.types.ArgumentosAssert,gram.i.types.ArgumentosAssert>>() {
          public tom.library.enumerator.F<gram.i.types.ArgumentosAssert,gram.i.types.ArgumentosAssert> apply(final gram.i.types.ArgumentosAssert t1) {
            return 
        new tom.library.enumerator.F<gram.i.types.ArgumentosAssert,gram.i.types.ArgumentosAssert>() {
          public gram.i.types.ArgumentosAssert apply(final gram.i.types.ArgumentosAssert t2) {
            return make(t1,t2);
          }
        };
          }
        }),t1),t2).pay();
          }
        };
          }
        };
  }

}
