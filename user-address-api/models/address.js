const {DataTypes} = require('sequelize')
const sequelize = require('./index')
const User = require('./user')

const Address = sequelize.define('Address', {
  address: {
    type: DataTypes.STRING,
    allowNull: false,
  },
})

// Establishing relationships
User.hasMany(Address, {foreignKey: 'userId'})
Address.belongsTo(User, {foreignKey: 'userId'})

module.exports = Address
