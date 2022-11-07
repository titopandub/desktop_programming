package org.example;

import java.util.*;

interface Section {
    void setContentId(List<Integer> contentId);
    void show();
}

class RandomSection implements Section {
    String title = "";
    List<Integer> contentId = new ArrayList<>();

    public RandomSection(String title) {
        this.title = title;
    }

    @Override
    public void setContentId(List<Integer> contentId) {
        for (int i = 0; i < 14; i++)
            this.contentId.add((int)(Math.random() * (14 + 1 - 1) + 1));
    }

    @Override
    public void show() {
        System.out.println("=====================================================");
        System.out.println("Random Section " + this.title);
        System.out.println(this.contentId.toString());
    }
}

class CuratedSection implements Section {
    String title = "";
    List<Integer> contentId = new ArrayList<>();

    public CuratedSection(String title) {
        this.title = title;
    }

    @Override
    public void setContentId(List<Integer> contentId) {
        this.contentId = contentId;
    }

    @Override
    public void show() {
        System.out.println("=====================================================");
        System.out.println("Curated Section " + this.title);
        System.out.println(this.contentId.toString());
    }
}

class ReverseSection implements Section {
    String title = "";
    List<Integer> contentId = new ArrayList<>();

    public ReverseSection(String title) {
        this.title = title;
    }

    @Override
    public void setContentId(List<Integer> contentId) {
        this.contentId = contentId;
        Collections.reverse(this.contentId);
    }

    @Override
    public void show() {
        System.out.println("=====================================================");
        System.out.println("Reverse Section " + this.title);
        System.out.println(this.contentId.toString());
    }
}

public class SectionExample {
    public static void main(String[] args) {
        List<Section> sectionList = new ArrayList<>(Arrays.asList(
                new RandomSection("One"), new CuratedSection("Two"),
                new RandomSection("Three"), new ReverseSection("Four"),
                new RandomSection("Five")
        ));

        for (Section section : sectionList) {
            section.setContentId(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
            section.show();
        }
    }
}
