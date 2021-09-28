
package com.br.taskme.service;

import com.br.taskme.models.Status;
import java.util.List;
import java.util.Optional;

public interface StatusService {

    public Status addStatus(Status status);

    public List<Status> listStatus();

    public Optional<Status> listStatusId(Integer integer);

    public Status updateStatus(Status status);

    public void deleteStatusId(Integer idStatus);
}
