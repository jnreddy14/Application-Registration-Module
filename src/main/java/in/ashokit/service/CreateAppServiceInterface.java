package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.binding.CreateApp;

@Service
public interface CreateAppServiceInterface {
	
	public Integer createApp(CreateApp createApp);

}
