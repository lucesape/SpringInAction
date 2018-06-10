package pl.sda.jira.calendar.persistency.inmemory;

import pl.sda.jira.calendar.domain.model.Calendar;
import pl.sda.jira.calendar.domain.CalendarRepository;
import pl.sda.jira.calendar.domain.service.CalendarService;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCalendarRepository implements CalendarRepository {
    private boolean existing = false;

    private Map<String, Calendar> calendarHashMap = new HashMap<>();


    public boolean existsForPersonWith(String personId) {
        return existing;
    }


    @Override
    public void add(Calendar calendar) {
        calendarHashMap.put(calendar.getID(), calendar);
    }

    @Override
    public void remove(String id) {
        calendarHashMap.remove(id);
    }

    @Override
    public void replace(Calendar calendar) {
        calendarHashMap.replace(calendar.getID(), calendar);
    }

    @Override
    public boolean exists(String id) {
        return calendarHashMap.containsKey(id);
    }

    @Override
    public Calendar findBy(String id) {
        return calendarHashMap.get(id);
    }
}

