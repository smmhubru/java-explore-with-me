package ru.practicum.explorewithme.event;

import java.util.List;
import java.util.Optional;

public interface EventStorage {
    Optional<Event> addEvent(Event event);
    Optional<Event> getEventById(Long eventId);
    List<Event> getAllEvents(int from, int size, boolean paid);
    List<Event> getEventsByUserIds(List<Long> userIds, int from, int size);
    Optional<Event> updateEvent(Long eventId, Event event);
}
