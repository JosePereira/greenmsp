
package gram.i.types.instrucao;



public final class Assert extends gram.i.types.Instrucao implements tom.library.sl.Visitable  {
  
  private static String symbolName = "Assert";


  private Assert() {}
  private int hashCode;
  private static Assert gomProto = new Assert();
    private String _Nome;
  private gram.i.types.ArgumentosAssert _ArgumentosAssert;
  private gram.i.types.ExpectedAssert _ExpectedAssert;

  /**
   * Constructor that builds a term rooted by Assert
   *
   * @return a term rooted by Assert
   */

  public static Assert make(String _Nome, gram.i.types.ArgumentosAssert _ArgumentosAssert, gram.i.types.ExpectedAssert _ExpectedAssert) {

    // use the proto as a model
    gomProto.initHashCode( _Nome,  _ArgumentosAssert,  _ExpectedAssert);
    return (Assert) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _Nome
   * @param _ArgumentosAssert
   * @param _ExpectedAssert
   * @param hashCode hashCode of Assert
   */
  private void init(String _Nome, gram.i.types.ArgumentosAssert _ArgumentosAssert, gram.i.types.ExpectedAssert _ExpectedAssert, int hashCode) {
    this._Nome = _Nome.intern();
    this._ArgumentosAssert = _ArgumentosAssert;
    this._ExpectedAssert = _ExpectedAssert;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _Nome
   * @param _ArgumentosAssert
   * @param _ExpectedAssert
   */
  private void initHashCode(String _Nome, gram.i.types.ArgumentosAssert _ArgumentosAssert, gram.i.types.ExpectedAssert _ExpectedAssert) {
    this._Nome = _Nome.intern();
    this._ArgumentosAssert = _ArgumentosAssert;
    this._ExpectedAssert = _ExpectedAssert;

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
    return "Assert";
  }

  /**
   * Returns the arity of the symbol
   *
   * @return the arity of the symbol
   */
  private int getArity() {
    return 3;
  }

  /**
   * Copy the object and returns the copy
   *
   * @return a clone of the SharedObject
   */
  public shared.SharedObject duplicate() {
    Assert clone = new Assert();
    clone.init( _Nome,  _ArgumentosAssert,  _ExpectedAssert, hashCode);
    return clone;
  }
  
  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("Assert(");
    buffer.append('"');
            for (int i = 0; i < _Nome.length(); i++) {
              char c = _Nome.charAt(i);
              switch (c) {
                case '\n':
                  buffer.append('\\');
                  buffer.append('n');
                  break;
                case '\t':
                  buffer.append('\\');
                  buffer.append('t');
                  break;
                case '\b':
                  buffer.append('\\');
                  buffer.append('b');
                  break;
                case '\r':
                  buffer.append('\\');
                  buffer.append('r');
                  break;
                case '\f':
                  buffer.append('\\');
                  buffer.append('f');
                  break;
                case '\\':
                  buffer.append('\\');
                  buffer.append('\\');
                  break;
                case '\'':
                  buffer.append('\\');
                  buffer.append('\'');
                  break;
                case '\"':
                  buffer.append('\\');
                  buffer.append('\"');
                  break;
                case '!':
                case '@':
                case '#':
                case '$':
                case '%':
                case '^':
                case '&':
                case '*':
                case '(':
                case ')':
                case '-':
                case '_':
                case '+':
                case '=':
                case '|':
                case '~':
                case '{':
                case '}':
                case '[':
                case ']':
                case ';':
                case ':':
                case '<':
                case '>':
                case ',':
                case '.':
                case '?':
                case ' ':
                case '/':
                  buffer.append(c);
                  break;

                default:
                  if (java.lang.Character.isLetterOrDigit(c)) {
                    buffer.append(c);
                  } else {
                    buffer.append('\\');
                    buffer.append((char) ('0' + c / 64));
                    c = (char) (c % 64);
                    buffer.append((char) ('0' + c / 8));
                    c = (char) (c % 8);
                    buffer.append((char) ('0' + c));
                  }
              }
            }
            buffer.append('"');
buffer.append(",");
    _ArgumentosAssert.toStringBuilder(buffer);
buffer.append(",");
    _ExpectedAssert.toStringBuilder(buffer);

    buffer.append(")");
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
    Assert tco = (Assert) ao;
    int _NomeCmp = (this._Nome).compareTo(tco._Nome);
    if(_NomeCmp != 0) {
      return _NomeCmp;
    }


    int _ArgumentosAssertCmp = (this._ArgumentosAssert).compareToLPO(tco._ArgumentosAssert);
    if(_ArgumentosAssertCmp != 0) {
      return _ArgumentosAssertCmp;
    }

    int _ExpectedAssertCmp = (this._ExpectedAssert).compareToLPO(tco._ExpectedAssert);
    if(_ExpectedAssertCmp != 0) {
      return _ExpectedAssertCmp;
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
    Assert tco = (Assert) ao;
    int _NomeCmp = (this._Nome).compareTo(tco._Nome);
    if(_NomeCmp != 0) {
      return _NomeCmp;
    }


    int _ArgumentosAssertCmp = (this._ArgumentosAssert).compareTo(tco._ArgumentosAssert);
    if(_ArgumentosAssertCmp != 0) {
      return _ArgumentosAssertCmp;
    }

    int _ExpectedAssertCmp = (this._ExpectedAssert).compareTo(tco._ExpectedAssert);
    if(_ExpectedAssertCmp != 0) {
      return _ExpectedAssertCmp;
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
   * @return true if obj is a Assert and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof Assert) {

      Assert peer = (Assert) obj;
      return _Nome==peer._Nome && _ArgumentosAssert==peer._ArgumentosAssert && _ExpectedAssert==peer._ExpectedAssert && true;
    }
    return false;
  }


   //Instrucao interface
  /**
   * Returns true if the term is rooted by the symbol Assert
   *
   * @return true, because this is rooted by Assert
   */
  @Override
  public boolean isAssert() {
    return true;
  }
  
  /**
   * Returns the attribute String
   *
   * @return the attribute String
   */
  @Override
  public String getNome() {
    return _Nome;
  }

  /**
   * Sets and returns the attribute gram.i.types.Instrucao
   *
   * @param set_arg the argument to set
   * @return the attribute String which just has been set
   */
  @Override
  public gram.i.types.Instrucao setNome(String set_arg) {
    return make(set_arg, _ArgumentosAssert, _ExpectedAssert);
  }
  
  /**
   * Returns the attribute gram.i.types.ArgumentosAssert
   *
   * @return the attribute gram.i.types.ArgumentosAssert
   */
  @Override
  public gram.i.types.ArgumentosAssert getArgumentosAssert() {
    return _ArgumentosAssert;
  }

  /**
   * Sets and returns the attribute gram.i.types.Instrucao
   *
   * @param set_arg the argument to set
   * @return the attribute gram.i.types.ArgumentosAssert which just has been set
   */
  @Override
  public gram.i.types.Instrucao setArgumentosAssert(gram.i.types.ArgumentosAssert set_arg) {
    return make(_Nome, set_arg, _ExpectedAssert);
  }
  
  /**
   * Returns the attribute gram.i.types.ExpectedAssert
   *
   * @return the attribute gram.i.types.ExpectedAssert
   */
  @Override
  public gram.i.types.ExpectedAssert getExpectedAssert() {
    return _ExpectedAssert;
  }

  /**
   * Sets and returns the attribute gram.i.types.Instrucao
   *
   * @param set_arg the argument to set
   * @return the attribute gram.i.types.ExpectedAssert which just has been set
   */
  @Override
  public gram.i.types.Instrucao setExpectedAssert(gram.i.types.ExpectedAssert set_arg) {
    return make(_Nome, _ArgumentosAssert, set_arg);
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
      new aterm.ATerm[] {(aterm.ATerm) atermFactory.makeAppl(atermFactory.makeAFun(getNome() ,0 , true)), getArgumentosAssert().toATerm(), getExpectedAssert().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a gram.i.types.Instrucao from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static gram.i.types.Instrucao fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
convertATermToString(appl.getArgument(0), atConv), gram.i.types.ArgumentosAssert.fromTerm(appl.getArgument(1),atConv), gram.i.types.ExpectedAssert.fromTerm(appl.getArgument(2),atConv)
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
    return 3;
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
        switch(index) {
      case 0: return new tom.library.sl.VisitableBuiltin<String>(_Nome);
      case 1: return _ArgumentosAssert;
      case 2: return _ExpectedAssert;
      default: throw new IndexOutOfBoundsException();
 }
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
        switch(index) {
      case 0: return make(getNome(), _ArgumentosAssert, _ExpectedAssert);
      case 1: return make(getNome(), (gram.i.types.ArgumentosAssert) v, _ExpectedAssert);
      case 2: return make(getNome(), _ArgumentosAssert, (gram.i.types.ExpectedAssert) v);
      default: throw new IndexOutOfBoundsException();
 }
  }

  /**
   * Set children to the term
   *
   * @param children array of children to set
   * @return an array of children which just were set
   * @throws IndexOutOfBoundsException if length of "children" is different than 3
   */
  @SuppressWarnings("unchecked")
  public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] children) {
    if (children.length == getChildCount()  && children[0] instanceof tom.library.sl.VisitableBuiltin && children[1] instanceof gram.i.types.ArgumentosAssert && children[2] instanceof gram.i.types.ExpectedAssert) {
      return make(((tom.library.sl.VisitableBuiltin<String>)children[0]).getBuiltin(), (gram.i.types.ArgumentosAssert) children[1], (gram.i.types.ExpectedAssert) children[2]);
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
    return new tom.library.sl.Visitable[] { new tom.library.sl.VisitableBuiltin<String>(_Nome),  _ArgumentosAssert,  _ExpectedAssert};
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
    b = (-1861173295<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (shared.HashFunctions.stringHashFunction(_Nome, 2) << 16);
    a += (_ArgumentosAssert.hashCode() << 8);
    a += (_ExpectedAssert.hashCode());

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
  public static tom.library.enumerator.F<tom.library.enumerator.Enumeration<String>,tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>,tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>,tom.library.enumerator.Enumeration<gram.i.types.Instrucao>>>> funMake() {
    return 
        new tom.library.enumerator.F<tom.library.enumerator.Enumeration<String>,tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>,tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>,tom.library.enumerator.Enumeration<gram.i.types.Instrucao>>>>() {
          public tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>,tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>,tom.library.enumerator.Enumeration<gram.i.types.Instrucao>>> apply(final tom.library.enumerator.Enumeration<String> t1) {
            return 
        new tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert>,tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>,tom.library.enumerator.Enumeration<gram.i.types.Instrucao>>>() {
          public tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>,tom.library.enumerator.Enumeration<gram.i.types.Instrucao>> apply(final tom.library.enumerator.Enumeration<gram.i.types.ArgumentosAssert> t2) {
            return 
        new tom.library.enumerator.F<tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert>,tom.library.enumerator.Enumeration<gram.i.types.Instrucao>>() {
          public tom.library.enumerator.Enumeration<gram.i.types.Instrucao> apply(final tom.library.enumerator.Enumeration<gram.i.types.ExpectedAssert> t3) {
            return tom.library.enumerator.Enumeration.apply(tom.library.enumerator.Enumeration.apply(tom.library.enumerator.Enumeration.apply(tom.library.enumerator.Enumeration.singleton((tom.library.enumerator.F<String,tom.library.enumerator.F<gram.i.types.ArgumentosAssert,tom.library.enumerator.F<gram.i.types.ExpectedAssert,gram.i.types.Instrucao>>>) 
        new tom.library.enumerator.F<String,tom.library.enumerator.F<gram.i.types.ArgumentosAssert,tom.library.enumerator.F<gram.i.types.ExpectedAssert,gram.i.types.Instrucao>>>() {
          public tom.library.enumerator.F<gram.i.types.ArgumentosAssert,tom.library.enumerator.F<gram.i.types.ExpectedAssert,gram.i.types.Instrucao>> apply(final String t1) {
            return 
        new tom.library.enumerator.F<gram.i.types.ArgumentosAssert,tom.library.enumerator.F<gram.i.types.ExpectedAssert,gram.i.types.Instrucao>>() {
          public tom.library.enumerator.F<gram.i.types.ExpectedAssert,gram.i.types.Instrucao> apply(final gram.i.types.ArgumentosAssert t2) {
            return 
        new tom.library.enumerator.F<gram.i.types.ExpectedAssert,gram.i.types.Instrucao>() {
          public gram.i.types.Instrucao apply(final gram.i.types.ExpectedAssert t3) {
            return make(t1,t2,t3);
          }
        };
          }
        };
          }
        }),t1),t2),t3).pay();
          }
        };
          }
        };
          }
        };
  }

}
