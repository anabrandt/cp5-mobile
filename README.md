
---

# Controle de Medicamentos

## Visão Geral do Projeto

O projeto é um aplicativo mobile de controle de medicação, desenvolvido em **Kotlin** no **Android Studio**, focado no acompanhamento e gerenciamento de medicamentos. O objetivo é auxiliar usuários, principalmente idosos e cuidadores, a administrar a tomada de medicamentos de forma mais eficiente e evitar problemas comuns como esquecimento e falta de estoque. O aplicativo também possui suporte para vários perfis, sendo ideal para hospitais e residências com múltiplos pacientes.

### Sumário

- [Descoberta](#descoberta)
- [Definição](#definição)
- [Ideação](#ideação)
- [Entregas](#entregas)
- [Funcionalidades do Aplicativo](#funcionalidades-do-aplicativo)
- [Configuração do Firebase](#configuração-do-firebase)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Como Contribuir](#como-contribuir)

---

## Descoberta

### Desk Research

Inicialmente, realizamos um **Desk Research** para entender melhor o público-alvo. Através de uma pesquisa sobre o uso de medicação no Brasil, identificamos alguns pontos importantes:

- **Idosos** são os maiores consumidores de medicação no Brasil.
- Após os **65 anos**, a população tende a ter até cinco doenças crônicas.
- O Brasil é uma potência no mercado farmacêutico, com altos índices de automedicação.
- As principais doenças crônicas são tratadas com medicamentos de uso contínuo.

Esses dados nos deram a direção para focar em soluções de controle de medicação para idosos e cuidadores.

### Benchmarking

Realizamos um **benchmarking** de soluções manuais e digitais para o controle de medicação. Avaliamos métodos como:
- Caderno, folha, caixinha de remédio
- Alarmes no celular e agendas digitais (Google Agenda, WhatsApp)

Notamos que essas soluções são incompletas e poderiam ser integradas em uma única ferramenta. Também analisamos **apps concorrentes** como My Therapy, Med Control, e Dr Cuco, o que gerou insights importantes sobre funcionalidades e interface.

### Pesquisa com Usuários

Após essas análises, realizamos entrevistas qualitativas e quantitativas com **8 participantes** (de 22 a 62 anos), investigando como eles administram seus medicamentos e as necessidades que possuem. Algumas descobertas importantes:

- **Esquecimento de medicação** é comum, mesmo com lembretes anotados.
- Muitos **medicamentos são tomados de acordo com condições específicas** (ex.: ao acordar, antes de dormir).
- Há pouca **gestão de estoque**, o que leva à falta de remédios nos momentos necessários.

## Definição

A partir das pesquisas, definimos duas personas principais: **Lucas** (um cuidador) e **Valéria** (uma idosa que faz uso de medicação). Desenhamos um **Mapa de Empatia** e **Jornada do Usuário** para entender as necessidades de cada um.

### Principais Insights

1. **Notificações e alarmes** para lembrar a tomada de medicamentos.
2. **Gestão de estoque** para evitar que o usuário fique sem remédios.
3. **Compartilhamento de rotinas** de medicação com cuidadores via WhatsApp.
4. Opção de **anotações diárias** para o usuário registrar como se sentiu.
5. **Multiusuário**: suporte para mais de um perfil no aplicativo.

## Ideação

Baseados nas necessidades dos usuários, construímos o fluxo do aplicativo e um **wireframe** para o MVP. Este fluxo inclui funcionalidades principais, como o registro de horários, controle de estoque, e gerenciamento de múltiplos perfis.

## Entregas

A entrega final foi um protótipo navegável (disponível no meu Behance) que cobre as funcionalidades essenciais e prioriza a usabilidade para o público-alvo.

## Funcionalidades do Aplicativo

- **Cadastro de medicamentos** com horários de administração.
- **Notificações e lembretes** para garantir a aderência ao tratamento.
- **Relatórios** de histórico de medicação.
- **Controle de estoque** com alertas para compra de novos remédios.
- **Multiusuário**: permite gerenciar o tratamento de várias pessoas.
- **Compartilhamento de rotina** com cuidadores via WhatsApp.
- **Integração com Firebase** para autenticação, armazenamento de dados, e sincronização em tempo real.

## Configuração do Firebase

Para implementar o Firebase no projeto, siga as etapas abaixo:

1. **Criar um Projeto no Firebase Console**:
   - Acesse o [Firebase Console](https://console.firebase.google.com/).
   - Clique em **Add Project** e siga as instruções.

2. **Adicionar o Firebase ao seu App**:
   - No Firebase Console, vá para **Configurações do Projeto** e escolha a plataforma Android.
   - Adicione o nome do pacote do aplicativo e siga as instruções para baixar o arquivo `google-services.json`.
   - Mova o arquivo `google-services.json` para o diretório `app` no seu projeto.

3. **Configurar o Firebase no Android Studio**:
   - No arquivo `build.gradle` do projeto, adicione a dependência do Firebase:
     ```gradle
     dependencies {
         implementation platform('com.google.firebase:firebase-bom:31.0.0')
         implementation 'com.google.firebase:firebase-auth'
         implementation 'com.google.firebase:firebase-firestore'
     }
     ```
   - Sincronize o projeto com o Gradle para baixar as dependências.

4. **Configurar Autenticação e Firestore**:
   - No Firebase Console, vá até **Authentication** e ative o método de login (por exemplo, email e senha).
   - Em **Firestore Database**, crie um banco de dados e configure as regras de acesso.

Agora, o Firebase está configurado para ser usado no aplicativo. Ele pode ser utilizado para armazenar e sincronizar os dados dos usuários em tempo real, além de fornecer autenticação segura.

## Tecnologias Utilizadas

- **Kotlin** para o desenvolvimento Android.
- **Firebase** para autenticação e banco de dados em tempo real.
- **Android Studio** como ambiente de desenvolvimento.
- **Material Design** para estilização de UI.
- **MVVM** como padrão arquitetural para organizar o código.

## Como Contribuir

1. Faça um fork do projeto.
2. Crie uma nova branch com a sua feature (`git checkout -b feature/sua-feature`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`).
4. Envie para o repositório (`git push origin feature/sua-feature`).
5. Abra um Pull Request.

---

Esse `README.md` deve ajudar a guiar desenvolvedores e colaboradores interessados em contribuir com o projeto.
