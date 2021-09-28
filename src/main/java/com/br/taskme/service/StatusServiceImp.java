
package com.br.taskme.service;

import com.br.taskme.models.Status;
import com.br.taskme.repository.StatusRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public class StatusServiceImp implements StatusService{

    @Autowired
    private StatusRepository statusRepository;
    
    @Override
    public Status addStatus(Status status) {
    return statusRepository.save(status);
    }

    @Override
    public List<Status> listStatus() {
    return statusRepository.findAll();
    }

    @Override
    public Optional<Status> listStatusId(Integer integer) {
    return statusRepository.findById(integer);
    }

    @Override
    public Status updateStatus(Status status) {
    return statusRepository.save(status);
    }

    @Override
    public void deleteStatusId(Integer idStatus) {
    statusRepository.deleteById(idStatus);
    }
    
}
