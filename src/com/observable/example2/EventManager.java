package com.observable.example2;

import java.util.*;
import java.util.function.Function;

public class EventManager {

    private Map<String, List<EventListener>> listeners = new HashMap<>();
    public Function<String, Integer> sizeByType = type -> listeners.get(type).size();

    public EventManager(String... types) {
        for (String type : types) {
            listeners.put(type, new ArrayList<>());
        }
    }

    void subscribe(String type, EventListener... eventListener) {
        listeners.get(type).addAll(Arrays.asList(eventListener));
    }

    void unsubscribe(String type, EventListener... eventListener) {
        listeners.get(type).removeAll(Arrays.asList(eventListener));
    }

    void notifyingAll() {
        listeners.values()
                .stream()
                .flatMap(Collection::stream)
                .forEach(listener -> listener.update("allType"));
    }

    void notifyingByType(String type) {
        listeners.get(type)
                .forEach(eventListener -> eventListener.update(type));
    }

}
