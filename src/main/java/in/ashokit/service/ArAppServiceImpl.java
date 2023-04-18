package in.ashokit.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.CreateApp;
import in.ashokit.entity.ArApp;
import in.ashokit.repository.ArRepo;

@Service
public class ArAppServiceImpl implements CreateAppServiceInterface {

	@Autowired
	ArRepo arRepo;

	@Override
	public Integer createApp(CreateApp createApp) {
		String url = "https://ssa-web-api.herokuapp.com/ssn/{ssn}";

		//RestTemplate rt = new RestTemplate();
	//	ResponseEntity<String> entity = rt.getForEntity(url,String.class,createApp.getSsn());
	//	String state = entity.getBody();
		String state="New Jersey";

		if ("New Jersey".equals(state)) {
			ArApp aa = new ArApp();
			BeanUtils.copyProperties(createApp, aa);
			aa.setStatename(state);
			arRepo.save(aa);
			return aa.getAppId();
		} else
			return 0;
	}

}
