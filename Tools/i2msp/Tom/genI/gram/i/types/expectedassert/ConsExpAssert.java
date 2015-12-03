
package gram.i.types.expectedassert;



public final class ConsExpAssert extends gram.i.types.expectedassert.ExpAssert implements tom.library.sl.Visitable  {
  
  private static String symbolName = "ConsExpAssert";


  private ConsExpAssert() {}
  private int hashCode;
  private static ConsExpAssert gomProto = new ConsExpAssert();
  
   private gram.i.types.ExpectedAssert[] children;
                  private gram.i.types.ExpectedAssert _HeadExpAssert;
  private gram.i.types.ExpectedAssert _TailExpAssert;

  /**
   * Constructor that builds a term rooted by ConsExpAssert
   *
   * @return a term rooted by ConsExpAssert
   */

    public static gram.i.types.ExpectedAssert make(gram.i.types.ExpectedAssert head, gram.i.types.ExpectedAssert tail) {
  if (true) {if (head.isEmptyExpAssert()) { return tail; }
if (head.isConsExpAssert()) { return make(head.getHeadExpAssert(),make(head.getTailExpAssert(),tail)); }
if (!tail.isConsExpAssert() && !tail.isEmptyExpAssert()) { return make(head,make(tail,EmptyExpAssert.make())); }
}
      return realMake( head,  tail);
    }
  
  private static ConsExpAssert realMake(gram.i.types.ExpectedAssert _HeadExpAssert, gram.i.types.ExpectedAssert _TailExpAssert) {

    // use the proto as a model
    gomProto.initHashCode( _HeadExpAssert,  _TailExpAssert);
    return (ConsExpAssert) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadExpAssert
   * @param _TailExpAssert
   * @param hashCode hashCode of ConsExpAssert
   */
  private void init(gram.i.types.ExpectedAssert _HeadExpAssert, gram.i.types.ExpectedAssert _TailExpAssert, int hashCode) {
    this._HeadExpAssert = _HeadExpAssert;
    this._TailExpAssert = _TailExpAssert;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _HeadExpAssert
   * @param _TailExpAssert
   */
  private void initHashCode(gram.i.types.ExpectedAssert _HeadExpAssert, gram.i.types.ExpectedAssert _TailExpAssert) {
    this._HeadExpAssert = _HeadExpAssert;
    this._TailExpAssert = _TailExpAssert;

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
    return "ConsExpAssert";
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
    ConsExpAssert clone = new ConsExpAssert();
    clone.init( _HeadExpAssert,  _TailExpAssert, hashCode);
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
    ConsExpAssert tco = (ConsExpAssert) ao;
    int _HeadExpAssertCmp = (this._HeadExpAssert).compareToLPO(tco._HeadExpAssert);
    if(_HeadExpAssertCmp != 0) {
      return _HeadExpAssertCmp;
    }

    int _TailExpAssertCmp = (this._TailExpAssert).compareToLPO(tco._TailExpAssert);
    if(_TailExpAssertCmp != 0) {
      return _TailExpAssertCmp;
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
    ConsExpAssert tco = (ConsExpAssert) ao;
    int _HeadExpAssertCmp = (this._HeadExpAssert).compareTo(tco._HeadExpAssert);
    if(_HeadExpAssertCmp != 0) {
      return _HeadExpAssertCmp;
    }

    int _TailExpAssertCmp = (this._TailExpAssert).compareTo(tco._TailExpAssert);
    if(_TailExpAssertCmp != 0) {
      return _TailExpAssertCmp;
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
   * @return true if obj is a ConsExpAssert and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof ConsExpAssert) {

      ConsExpAssert peer = (ConsExpAssert) obj;
      return _HeadExpAssert==peer._HeadExpAssert && _TailExpAssert==peer._TailExpAssert && true;
    }
    return false;
  }


   //ExpectedAssert interface
  /**
   * Returns true if the term is rooted by the symbol ConsExpAssert
   *
   * @return true, because this is rooted by ConsExpAssert
   */
  @Override
  public boolean isConsExpAssert() {
    return true;
  }
  
  /**
   * Returns the attribute gram.i.types.ExpectedAssert
   *
   * @return the attribute gram.i.types.ExpectedAssert
   */
  @Override
  public gram.i.types.ExpectedAssert getHeadExpAssert() {
    return _HeadExpAssert;
  }

  /**
   * Sets and returns the attribute gram.i.types.ExpectedAssert
   *
   * @param set_arg the argument to set
   * @return the attribute gram.i.types.ExpectedAssert which just has been set
   */
  @Override
  public gram.i.types.ExpectedAssert setHeadExpAssert(gram.i.types.ExpectedAssert set_arg) {
    return make(set_arg, _TailExpAssert);
  }
  
  /**
   * Returns the attribute gram.i.types.ExpectedAssert
   *
   * @return the attribute gram.i.types.ExpectedAssert
   */
  @Override
  public gram.i.types.ExpectedAssert getTailExpAssert() {
    return _TailExpAssert;
  }

  /**
   * Sets and returns the attribute gram.i.types.ExpectedAssert
   *
   * @param set_arg the argument to set
   * @return the attribute gram.i.types.ExpectedAssert which just has been set
   */
  @Override
  public gram.i.types.ExpectedAssert setTailExpAssert(gram.i.types.ExpectedAssert set_arg) {
    return make(_HeadExpAssert, set_arg);
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
      new aterm.ATerm[] {getHeadExpAssert().toATerm(), getTailExpAssert().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a gram.i.types.ExpectedAssert from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static gram.i.types.ExpectedAssert fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
gram.i.types.ExpectedAssert.fromTerm(appl.getArgument(0),atConv), gram.i.types.ExpectedAssert.fromTerm(appl.getArgument(1),atConv)
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
      gram.i.types.ExpectedAssert[] new_children = new gram.i.types.ExpectedAssert[children.length];
      for(int i =0; i<children.length; i++) {
        new_children[i] = ((gram.i.types.ExpectedAssert) children[i]); 
      }
     new_children[index] = (gram.i.types.ExpectedAssert) v;
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
      
               gram.i.types.ExpectedAssert[] typed_children = new gram.i.types.ExpectedAssert[children.length];
              for (int i=0; i<children.length; i++) {
                typed_children[i] = (gram.i.types.ExpectedAssert) children[i]; 
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
          children = toArray(new gram.i.types.ExpectedAssert[]{});
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
    b = (-348511722<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_HeadExpAssert.hashCode() << 8);
    a += (_TailExpAssert.hashCode());

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
  public static tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>,tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>,tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>>> funMake() {
    return 
        new tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>,tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>,tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>>>() {
          public tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>,tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>> apply(final tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert> t1) {
            return 
        new tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>,tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>>() {
          public tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert> apply(final tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert> t2) {
            return tom.library.enumerator.Enumeration.apply(tom.library.enumerator.Enumeration.apply(tom.library.enumerator.Enumeration.singleton((tom.library.enumerator.F<gram.i.types.ExpectedAssert,tom.library.enumerator.F<gram.i.types.ExpectedAssert,gram.i.types.ExpectedAssert>>) 
        new tom.library.enumerator.F<gram.i.types.ExpectedAssert,tom.library.enumerator.F<gram.i.types.ExpectedAssert,gram.i.types.ExpectedAssert>>() {
          public tom.library.enumerator.F<gram.i.types.ExpectedAssert,gram.i.types.ExpectedAssert> apply(final gram.i.types.ExpectedAssert t1) {
            return 
        new tom.library.enumerator.F<gram.i.types.ExpectedAssert,gram.i.types.ExpectedAssert>() {
          public gram.i.types.ExpectedAssert apply(final gram.i.types.ExpectedAssert t2) {
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
