package org.smart.doghealth.service;

import org.smart.doghealth.domain.Cause;

import java.util.Set;

public interface CauseService extends CRUDService<Cause,Long> {
    Set<Cause> getCauses();
    Cause findByDescriptionEqualsIgnoreCase(String string);
}
