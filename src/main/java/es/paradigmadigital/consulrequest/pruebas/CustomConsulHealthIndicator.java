package es.paradigmadigital.consulrequest.pruebas;
public class CustomConsulHealthIndicator{
//@Configuration
//	public class CustomConsulHealthIndicator extends AbstractHealthIndicator {
//	
//	@Autowired
//	ConfigurableApplicationContext ctx;
//
//		private ConsulClient consul;
//
//		public CustomConsulHealthIndicator(ConsulClient consul) {
//			
//			this.consul = consul;
//		}
//
//		@Override
//		protected void doHealthCheck(Health.Builder builder) throws Exception {
//			try {
//				
////				BeanDefinitionRegistry registry = (BeanDefinitionRegistry) ctx.getAutowireCapableBeanFactory();
////				for (String beanName : ctx.getBeanDefinitionNames()) {
////					if(beanName.equals("consulHealthIndicator")){
////						System.out.println("consulHealthIndicator");
////					registry.removeBeanDefinition(beanName);
////					}
////				}
//				
//				HttpGet httpGet = new HttpGet("http://localhost:8500/v1/agent/self");
//				HttpClient client = HttpClientBuilder.create().build();
//				HttpResponse response = client.execute(httpGet);
//				CustomSelf custom = GsonFactory.getGson().fromJson(EntityUtils.toString(response.getEntity(), Charset.forName("UTF-8")), CustomSelf.class);
//				
//				Response<Map<String, List<String>>> services = consul
//						.getCatalogServices(QueryParams.DEFAULT);
//				builder.up()
//						.withDetail("services", services.getValue())
//					//	.withDetail("advertiseAddress", custom.getCustomDebugConfig().getAdvertiseAddress())
//					//	.withDetail("datacenter", custom.getCustomDebugConfig().getDatacenter())
//					//	.withDetail("domain", custom.getConfig().getDomain())
//						.withDetail("nodeName", custom.getConfig().getNodeName());
//					//	.withDetail("bindAddress", custom.getCustomDebugConfig().getBindAddress())
//					//	.withDetail("clientAddress", custom.getCustomDebugConfig().getClientAddress());
//			}
//			catch (Exception e) {
//				builder.down(e);
//			}
//		}
//	
}
