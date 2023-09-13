# SuperMarioWorldGuide
<h3 align = "center">Projeto para matéria de programação de dispositivos móveis </a></h3>

### GitHub dos itegrantes

Jefferson Bispo da Silva:
> GitHub [@JeffersonXS](https://github.com/JeffersonXS) &nbsp;&middot;&nbsp;

Lucas Barreto Barbosa:
> GitHub [@LucasBarbosa22](https://github.com/LucasBarbosa22) &nbsp;&middot;&nbsp;

## Aviso
Foi corrigido presencialmente no dia 16/06/2023

# Explicação do projeto

<h4 align = "center">
  Criamos uma aplicação, onde, falamos alguns detalhes do jogo Super Mario World, também conhecido como Super Mario Bros. 4 lá no Japão. 
  Nessa aplicação contém informações sobre o jogo, como a história, os personagens, fases e algumas curiosidades. Para podermos mostrar essas informações foi preciso implementação de Intents: "implícitas" e "explícitas".
</a></h4>

<br>
<p align="center"><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/48b253f0-1a8d-4734-9366-a49072def0d5.gif"/></p>
<br>

* Nossa aplicação apresenta as seguintes páginas:
  - Splash Screen;
  - Menu;
  - Sobre;
  - História;
  - Personagens; 
  - Mundos;
  - Saiba Mais;
  - Ícone.
 
#### Em cada uma dessas abas colocamos um botão para voltarmos para o menu, exceto a "Splash Screen" e o "Ícone", porque são coisas mais visuais. Com relação a elementos de tela, numa revisão geral, colocamos: TextView, ImageView, ScrollView, Button e além de LinearLayout, tanto horizontal quanto vertical e ConstraintLayout.

<h1 align= "center"> SPLASH SCREEN </h1>
<h5 align = "center">
A "Splash Screen" ela é uma tela onde aparece a logo do aplicativo por um determinado tempo em milissegundos no código, antes do app abrir a página principal. No nosso caso queriamos 1 segundos(1000ms) e, logo após, aparecer a tela de menu. Por exemplo o app do Spotify, quando abrimos o aplicativo ele fica cerca 3 a 4 segundos com a logo da empresa na tela e depois abre a página inicial.
</a><h5>

<h1 align="center">
  <a><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/8981f460-0bd8-4061-a133-1ea90a556cba"  height ="550"></a> <a><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/1f44ae79-eec6-4b52-b891-70d9f0e88208"  height ="550" </a>
     <br>
 </h1>
  
<h1 align= "center"> MENU </h1>
<h5 align = "center">
No menu apresentamos o nome do jogo, uma imagem de fundo do Super Mario World e mais cinco botões que irão lincar com as outras abas com mais informações do jogo.
</a><h5>
  
<h1 align="center">
  <a><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/8592b4fa-92ed-4e31-8797-39683113c8f8"  height ="550"></a> <a><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/1f44ae79-eec6-4b52-b891-70d9f0e88208"  height ="550" </a>
     <br>
 </h1>
 
  
<h1 align= "center"> SOBRE </h1>
<h5 align = "center">
No botão de sobre algumas curiosidades e especificações básicas sobre o jogo. Como: ano de lançamento, empresa desenvolvedora e mais outros detalhes.
</a><h5>
       
<h1 align="center">
  <a align= "center"><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/b7f58cbe-42c8-44e4-b0de-feb5281c7cb0"  height ="550"></a> <a align= "center"><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/abb21e68-b6b5-4539-89e8-13b70dcae14e"  height ="550"></a>
  <br>
</h1>         

<h1 align= "center"> HISTÓRIA </h1>
<h5 align = "center">
Nesse descrevemos a aventura do mundo de Super Mario World.
</a><h5>
  
<h1 align="center">
  <a align= "center"><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/811951fe-e823-4815-8314-86884bb4549b"  height ="550"></a> <a align= "center"><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/b870ebf2-53df-4a27-bfa4-2f6287befdb7"  height ="550"></a>
  <br>
</h1>

<h1 align= "center"> PERSONAGENS </h1>
<h5 align = "center">
No botão de personagem, leva para uma nova página e nela falamos, brevemente, dos principais personagens presentes no jogo.
</a><h5>
  
<h1 align="center">
  <a align= "center"><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/6445e005-1a9d-4966-8d44-0bbc8ebf0bc0"  height ="550"></a> <a align= "center"><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/a1118e13-f8fe-4b67-aba4-bab51355cf68"  height ="550"></a>
  <br>
</h1>

<h1 align="center"> MUNDOS </h1>
<h5 align = "center">
Apresentamos uma descrição e imagens de cada um dos 9 mundos abrangentes na história do jogo.
</a><h5>
  
<h1 align="center">
  <a align= "center"><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/c2222b8a-abfc-4d64-b2d8-f8dde3996cc3"  height ="550"></a> <a align= "center"><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/58640843-1416-4e3a-b1f0-9b04a0975304"  height ="550"></a>
  <br>
</h1>
  
<h1 align="center"> SAIBA MAIS </h1>
<h5 align = "center">
Definimos esse botão como uma ponte para enviar o usúario numa página no google, no qual essa aba tem informações mais detalhadas sobre o jogo do Super Mario World. Ao clicarmos no botão somos mandados para uma nova aba no aplicativo, dentro dela tem mais três opções que levaram o usúario ao google.
</a><h5>

  * Na primeira, leva para uma página de compras virtuais do jogo Super Mario World;
  * Na segunda, é o google map mostrando as lojas físicas mais próximas que contém o jogo;
  * E na terceira, somos direcionados para uma wiki do Super Mario World, que contém informações mais minuciosas do jogo.
  
<h1 align="center">
  <a align= "center"><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/06952b53-9da8-46e9-ae4a-1876c40db6a8"  height ="550"></a> <a align= "center"><img src="https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/35b1bd39-5f83-4c97-abb9-b7db98deb8a4"  height ="550"></a>
  <br>
</h1>

## FUNCIONAMENTO COMPLETO DO APP
  
* Clique no link abaixo para ser direcionado ao vídeo do procedimento do aplicativo.
  
[![APP-SUPER_MARIO_WORLD](https://img.youtube.com/vi/01XI8Fud3x0)](https://www.youtube.com/watch?v=01XI8Fud3x0)
  
![Aplicativo_-_Vídeo_AdobeExpress](https://github.com/LucasBarbosa22/SuperMarioWorldGuide/assets/101645699/47b657ae-6aa0-4c0a-9298-6d03563f0a27) 

