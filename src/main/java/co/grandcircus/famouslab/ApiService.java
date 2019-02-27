package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.famouslab.model.Complete;
import co.grandcircus.famouslab.model.CompleteResponse;
import co.grandcircus.famouslab.model.Tiny;
import co.grandcircus.famouslab.model.TinyResponse;

@Component
public class ApiService {
	
	
	private RestTemplate restTemplate = new RestTemplate();
	
	private RestTemplate restTemplateWithUserAgent;

	
	
	public List<Complete>findAll(){
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
	
		CompleteResponse response = restTemplateWithUserAgent.getForObject(url, CompleteResponse.class);
		return response.getComplete();
	}
	
	public List<Tiny> tiny(){
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		
		TinyResponse response = restTemplateWithUserAgent.getForObject(url, TinyResponse.class);
		return response.getTiny();		
	}
	
	
}
