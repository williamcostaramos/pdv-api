# Sistema Gestão de Vendas#
## Projeto criado usando Tecnologia **Spring Framework**, **Postgres**, **hibernate 5.4-final**
Este projeto tem como objetivo criar um sistema simples de ponto de venda, usando **Spring** para criacão do sistema de API.
Este projeto será Hospedado em um Ambiente em cloud, que no momento ainda não está definido.
Todas as informações detalhadas de como ele foi construido, será colocado aqui e também no meu canal no youtube.
## Configurações do projeto
~~~JAVA
@PostConstruct
public void init() {
	try {
		inicializaServicos();
		recebeObjetoBundleVerificaPermissao();
		inicializaAtributos();
	} catch (Exception e) {
		if (e instanceof HashSegurancaException) {
			witbMessagesHelper.keepMessageToNextRequest().showErroSeguranca(e, this.getClass());
			facesUtil.redirectTo(PrettyURLUtil.URL_ERROR_401);
			} else {
			witbMessagesHelper.keepMessageToNextRequest().showErroInterno(e, this.getClass());
			facesUtil.redirectTo(PrettyURLUtil.URL_CONTATO_LISTAR);
			}
		}
	}
~~~
### Minhas Redes Sociais
 1. Instagram <https://nstagram.com/williamramos095>
