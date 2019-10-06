import { AuthConfig } from 'angular-oauth2-oidc';

export const authConfig: AuthConfig = {
  issuer: 'https://identity.wso2training.com/oauth2/token',
  redirectUri: 'http://localhost:4200',
  strictDiscoveryDocumentValidation: false,
  clientId: 'JGekbuwWq9TvYSTgVQ4QC52npHYa',
  scope: 'openid profile email',
}

export const authConfigProd: AuthConfig = {
  issuer: 'https://identity.wso2training.com/oauth2/token',
  redirectUri: 'https://www.projetoajudaai.com.br',
  strictDiscoveryDocumentValidation: false,
  clientId: '45luynHbhKl16blV5dCUsKABwIsa',
  scope: 'openid profile email',
}