import { SueljeApiClient } from '@suelje/fernstart';

void main();

async function main() {
  const client = new SueljeApiClient( {
    environment: 'dev'
});

  const response = await client.imdb.getMovie('19');

  console.log('Received response from Raven', response);
}
