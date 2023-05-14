package Model.Entity;

import java.io.Serializable;
import java.util.*;
import java.util.function.IntFunction;

public class Sweet implements List<Sweet>, Serializable {

    private transient double  weight;
    private double price;
    private String sweetsKind;

    public Sweet() {

    }

    public Sweet(double weight, double price, String sweetsKind) {
        this.price = price;
        this.weight = weight;
        this.sweetsKind = sweetsKind;
    }

    public Sweet(Sweet sweet){
        price = sweet.price;
        weight = sweet.weight;
        sweetsKind = sweet.sweetsKind;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSweetsKind() {
        return sweetsKind;
    }

    public void setSweetsKind(String sweetnessKind) {
        this.sweetsKind = sweetnessKind;
    }

    @Override
    public String toString() {
        return  getSweetsKind()+
                ", Price: " + getPrice() + "$" +
                ", Weight: " + getWeight() + " grams";

    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Sweet> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(Sweet sweet) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Sweet> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends Sweet> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Sweet get(int i) {
        return null;
    }

    @Override
    public Sweet set(int i, Sweet sweet) {
        return null;
    }

    @Override
    public void add(int i, Sweet sweet) {

    }

    @Override
    public Sweet remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Sweet> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Sweet> listIterator(int i) {
        return null;
    }

    @Override
    public List<Sweet> subList(int i, int i1) {
        return null;
    }
}


