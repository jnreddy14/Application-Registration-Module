package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.ArApp;

public interface ArRepo extends JpaRepository<ArApp, Serializable> {

}
