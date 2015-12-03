
package gram.i.types.argumentosassert;



public abstract class ListaArgsAssert extends gram.i.types.ArgumentosAssert implements java.util.Collection<gram.i.types.ArgumentosAssert>  {


  /**
   * Returns the number of arguments of the variadic operator
   *
   * @return the number of arguments of the variadic operator
   */
  @Override
  public int length() {
    if(this instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
      gram.i.types.ArgumentosAssert tl = this.getTailListaArgsAssert();
      if (tl instanceof ListaArgsAssert) {
        return 1+((ListaArgsAssert)tl).length();
      } else {
        return 2;
      }
    } else {
      return 0;
    }
  }

  public static gram.i.types.ArgumentosAssert fromArray(gram.i.types.ArgumentosAssert[] array) {
    gram.i.types.ArgumentosAssert res = gram.i.types.argumentosassert.EmptyListaArgsAssert.make();
    for(int i = array.length; i>0;) {
      res = gram.i.types.argumentosassert.ConsListaArgsAssert.make(array[--i],res);
    }
    return res;
  }

  /**
   * Inverses the term if it is a list
   *
   * @return the inverted term if it is a list, otherwise the term itself
   */
  @Override
  public gram.i.types.ArgumentosAssert reverse() {
    if(this instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
      gram.i.types.ArgumentosAssert cur = this;
      gram.i.types.ArgumentosAssert rev = gram.i.types.argumentosassert.EmptyListaArgsAssert.make();
      while(cur instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
        rev = gram.i.types.argumentosassert.ConsListaArgsAssert.make(cur.getHeadListaArgsAssert(),rev);
        cur = cur.getTailListaArgsAssert();
      }

      if(!(cur instanceof gram.i.types.argumentosassert.EmptyListaArgsAssert)) {
        rev = gram.i.types.argumentosassert.ConsListaArgsAssert.make(cur,rev);
      }

      return rev;
    } else {
      return this;
    }
  }

  /**
   * Appends an element
   *
   * @param element element which has to be added
   * @return the term with the added element
   */
  public gram.i.types.ArgumentosAssert append(gram.i.types.ArgumentosAssert element) {
    if(this instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
      gram.i.types.ArgumentosAssert tl = this.getTailListaArgsAssert();
      if (tl instanceof ListaArgsAssert) {
        return gram.i.types.argumentosassert.ConsListaArgsAssert.make(this.getHeadListaArgsAssert(),((ListaArgsAssert)tl).append(element));
      } else {

        return gram.i.types.argumentosassert.ConsListaArgsAssert.make(this.getHeadListaArgsAssert(),gram.i.types.argumentosassert.ConsListaArgsAssert.make(tl,element));

      }
    } else {
      return gram.i.types.argumentosassert.ConsListaArgsAssert.make(element,this);
    }
  }

  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("ListaArgsAssert(");
    if(this instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
      gram.i.types.ArgumentosAssert cur = this;
      while(cur instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
        gram.i.types.ArgumentosAssert elem = cur.getHeadListaArgsAssert();
        cur = cur.getTailListaArgsAssert();
        elem.toStringBuilder(buffer);

        if(cur instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
          buffer.append(",");
        }
      }
      if(!(cur instanceof gram.i.types.argumentosassert.EmptyListaArgsAssert)) {
        buffer.append(",");
        cur.toStringBuilder(buffer);
      }
    }
    buffer.append(")");
  }

  /**
   * Returns an ATerm representation of this term.
   *
   * @return an ATerm representation of this term.
   */
  public aterm.ATerm toATerm() {
    aterm.ATerm res = atermFactory.makeList();
    if(this instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
      gram.i.types.ArgumentosAssert tail = this.getTailListaArgsAssert();
      res = atermFactory.makeList(getHeadListaArgsAssert().toATerm(),(aterm.ATermList)tail.toATerm());
    }
    return res;
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
      if("ListaArgsAssert".equals(appl.getName())) {
        gram.i.types.ArgumentosAssert res = gram.i.types.argumentosassert.EmptyListaArgsAssert.make();

        aterm.ATerm array[] = appl.getArgumentArray();
        for(int i = array.length-1; i>=0; --i) {
          gram.i.types.ArgumentosAssert elem = gram.i.types.ArgumentosAssert.fromTerm(array[i],atConv);
          res = gram.i.types.argumentosassert.ConsListaArgsAssert.make(elem,res);
        }
        return res;
      }
    }

    if(trm instanceof aterm.ATermList) {
      aterm.ATermList list = (aterm.ATermList) trm;
      gram.i.types.ArgumentosAssert res = gram.i.types.argumentosassert.EmptyListaArgsAssert.make();
      try {
        while(!list.isEmpty()) {
          gram.i.types.ArgumentosAssert elem = gram.i.types.ArgumentosAssert.fromTerm(list.getFirst(),atConv);
          res = gram.i.types.argumentosassert.ConsListaArgsAssert.make(elem,res);
          list = list.getNext();
        }
      } catch(IllegalArgumentException e) {
        // returns null when the fromATerm call failed
        return null;
      }
      return res.reverse();
    }

    return null;
  }

  /*
   * Checks if the Collection contains all elements of the parameter Collection
   *
   * @param c the Collection of elements to check
   * @return true if the Collection contains all elements of the parameter, otherwise false
   */
  public boolean containsAll(java.util.Collection c) {
    java.util.Iterator it = c.iterator();
    while(it.hasNext()) {
      if(!this.contains(it.next())) {
        return false;
      }
    }
    return true;
  }

  /**
   * Checks if gram.i.types.ArgumentosAssert contains a specified object
   *
   * @param o object whose presence is tested
   * @return true if gram.i.types.ArgumentosAssert contains the object, otherwise false
   */
  public boolean contains(Object o) {
    gram.i.types.ArgumentosAssert cur = this;
    if(o==null) { return false; }
    if(cur instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
      while(cur instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
        if( o.equals(cur.getHeadListaArgsAssert()) ) {
          return true;
        }
        cur = cur.getTailListaArgsAssert();
      }
      if(!(cur instanceof gram.i.types.argumentosassert.EmptyListaArgsAssert)) {
        if( o.equals(cur) ) {
          return true;
        }
      }
    }
    return false;
  }

  //public boolean equals(Object o) { return this == o; }

  //public int hashCode() { return hashCode(); }

  /**
   * Checks the emptiness
   *
   * @return true if empty, otherwise false
   */
  public boolean isEmpty() { return isEmptyListaArgsAssert() ; }

  public java.util.Iterator<gram.i.types.ArgumentosAssert> iterator() {
    return new java.util.Iterator<gram.i.types.ArgumentosAssert>() {
      gram.i.types.ArgumentosAssert list = ListaArgsAssert.this;

      public boolean hasNext() {
        return list!=null && !list.isEmptyListaArgsAssert();
      }

      public gram.i.types.ArgumentosAssert next() {
        if(list.isEmptyListaArgsAssert()) {
          throw new java.util.NoSuchElementException();
        }
        if(list.isConsListaArgsAssert()) {
          gram.i.types.ArgumentosAssert head = list.getHeadListaArgsAssert();
          list = list.getTailListaArgsAssert();
          return head;
        } else {
          // we are in this case only if domain=codomain
          // thus, the cast is safe
          Object res = list;
          list = null;
          return (gram.i.types.ArgumentosAssert)res;
        }
      }

      public void remove() {
        throw new UnsupportedOperationException("Not yet implemented");
      }
    };

  }

  public boolean add(gram.i.types.ArgumentosAssert o) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public boolean addAll(java.util.Collection<? extends gram.i.types.ArgumentosAssert> c) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public boolean remove(Object o) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public void clear() {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public boolean removeAll(java.util.Collection c) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  public boolean retainAll(java.util.Collection c) {
    throw new UnsupportedOperationException("This object "+this.getClass().getName()+" is not mutable");
  }

  /**
   * Returns the size of the collection
   *
   * @return the size of the collection
   */
  public int size() { return length(); }

  /**
   * Returns an array containing the elements of the collection
   *
   * @return an array of elements
   */
  public Object[] toArray() {
    int size = this.length();
    Object[] array = new Object[size];
    int i=0;
    if(this instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
      gram.i.types.ArgumentosAssert cur = this;
      while(cur instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
        gram.i.types.ArgumentosAssert elem = cur.getHeadListaArgsAssert();
        array[i] = elem;
        cur = cur.getTailListaArgsAssert();
        i++;
      }
      if(!(cur instanceof gram.i.types.argumentosassert.EmptyListaArgsAssert)) {
        array[i] = cur;
      }
    }
    return array;
  }

  @SuppressWarnings("unchecked")
  public <T> T[] toArray(T[] array) {
    int size = this.length();
    if (array.length < size) {
      array = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), size);
    } else if (array.length > size) {
      array[size] = null;
    }
    int i=0;
    if(this instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
      gram.i.types.ArgumentosAssert cur = this;
      while(cur instanceof gram.i.types.argumentosassert.ConsListaArgsAssert) {
        gram.i.types.ArgumentosAssert elem = cur.getHeadListaArgsAssert();
        array[i] = (T)elem;
        cur = cur.getTailListaArgsAssert();
        i++;
      }
      if(!(cur instanceof gram.i.types.argumentosassert.EmptyListaArgsAssert)) {
        array[i] = (T)cur;
      }
    }
    return array;
  }

  /*
   * to get a Collection for an immutable list
   */
  public java.util.Collection<gram.i.types.ArgumentosAssert> getCollection() {
    return new CollectionListaArgsAssert(this);
  }

  public java.util.Collection<gram.i.types.ArgumentosAssert> getCollectionListaArgsAssert() {
    return new CollectionListaArgsAssert(this);
  }

  /************************************************************
   * private static class
   ************************************************************/
  private static class CollectionListaArgsAssert implements java.util.Collection<gram.i.types.ArgumentosAssert> {
    private ListaArgsAssert list;

    public ListaArgsAssert getArgumentosAssert() {
      return list;
    }

    public CollectionListaArgsAssert(ListaArgsAssert list) {
      this.list = list;
    }

    /**
     * generic
     */
  public boolean addAll(java.util.Collection<? extends gram.i.types.ArgumentosAssert> c) {
    boolean modified = false;
    java.util.Iterator<? extends gram.i.types.ArgumentosAssert> it = c.iterator();
    while(it.hasNext()) {
      modified = modified || add(it.next());
    }
    return modified;
  }

  /**
   * Checks if the collection contains an element
   *
   * @param o element whose presence has to be checked
   * @return true if the element is found, otherwise false
   */
  public boolean contains(Object o) {
    return getArgumentosAssert().contains(o);
  }

  /**
   * Checks if the collection contains elements given as parameter
   *
   * @param c elements whose presence has to be checked
   * @return true all the elements are found, otherwise false
   */
  public boolean containsAll(java.util.Collection<?> c) {
    return getArgumentosAssert().containsAll(c);
  }

  /**
   * Checks if an object is equal
   *
   * @param o object which is compared
   * @return true if objects are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    return getArgumentosAssert().equals(o);
  }

  /**
   * Returns the hashCode
   *
   * @return the hashCode
   */
  @Override
  public int hashCode() {
    return getArgumentosAssert().hashCode();
  }

  /**
   * Returns an iterator over the elements in the collection
   *
   * @return an iterator over the elements in the collection
   */
  public java.util.Iterator<gram.i.types.ArgumentosAssert> iterator() {
    return getArgumentosAssert().iterator();
  }

  /**
   * Return the size of the collection
   *
   * @return the size of the collection
   */
  public int size() {
    return getArgumentosAssert().size();
  }

  /**
   * Returns an array containing all of the elements in this collection.
   *
   * @return an array of elements
   */
  public Object[] toArray() {
    return getArgumentosAssert().toArray();
  }

  /**
   * Returns an array containing all of the elements in this collection.
   *
   * @param array array which will contain the result
   * @return an array of elements
   */
  public <T> T[] toArray(T[] array) {
    return getArgumentosAssert().toArray(array);
  }

/*
  public <T> T[] toArray(T[] array) {
    int size = getArgumentosAssert().length();
    if (array.length < size) {
      array = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), size);
    } else if (array.length > size) {
      array[size] = null;
    }
    int i=0;
    for(java.util.Iterator it=iterator() ; it.hasNext() ; i++) {
        array[i] = (T)it.next();
    }
    return array;
  }
*/
    /**
     * Collection
     */

    /**
     * Adds an element to the collection
     *
     * @param o element to add to the collection
     * @return true if it is a success
     */
    public boolean add(gram.i.types.ArgumentosAssert o) {
      list = (ListaArgsAssert)gram.i.types.argumentosassert.ConsListaArgsAssert.make(o,list);
      return true;
    }

    /**
     * Removes all of the elements from this collection
     */
    public void clear() {
      list = (ListaArgsAssert)gram.i.types.argumentosassert.EmptyListaArgsAssert.make();
    }

    /**
     * Tests the emptiness of the collection
     *
     * @return true if the collection is empty
     */
    public boolean isEmpty() {
      return list.isEmptyListaArgsAssert();
    }

    public boolean remove(Object o) {
      throw new UnsupportedOperationException("Not yet implemented");
    }

    public boolean removeAll(java.util.Collection<?> c) {
      throw new UnsupportedOperationException("Not yet implemented");
    }

    public boolean retainAll(java.util.Collection<?> c) {
      throw new UnsupportedOperationException("Not yet implemented");
    }

  }


}
