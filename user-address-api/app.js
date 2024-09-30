const express = require('express');
const bodyParser = require('body-parser');
const sequelize = require('./models/index');
const userRoutes = require('./routes/user');

const app = express();
app.use(bodyParser.json());

app.use('/api', userRoutes);

// Sync database and start server
sequelize.sync({ force: true }).then(() => {
  app.listen(3000, () => {
    console.log('Server running on http://localhost:3000');
  });
}).catch((err) => {
  console.error('Unable to sync database:', err);
});
