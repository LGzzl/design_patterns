package com.zzl.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 用菜单对象做例子
 * @author zzl
 */
public class Menu implements Component {

    private String name;
    private String ico;
    private String url;
    private List<Component> children = new ArrayList<>(6);

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component get(int i) {
        return children.get(i);
    }

    @Override
    public List<Component> get() {
        return children;
    }

    @Override
    public void display(int index) {
        for (int i = 0; i < index; i++) {
            System.out.print("-");
        }
        System.out.println("name:" + name + "- ico:" + ico + "- url:" + url);
        for (Component child : this.children) {
            child.display(index + 1);
        }
    }

    public Menu() {
    }

    public Menu(String name, String ico, String url) {
        this.name = name;
        this.ico = ico;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setChildren(List<Component> children) {
        this.children = children;
    }
}
